/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author lenovo
 */
public class Hide_sentence extends CharOperation {

    String temp = "";
    private String threepixel = new String();
    private String Twopixel = new String();
    private String onepixel = new String();
    private String b;
    BufferedImage orginImage;
    private int width;
    private int height;
    private int pixel;
    private String my_text;
    byte[] char_array;
    private int char_array_size;
    private int char_counter;
    private String newpixels;
    private String plain_text;
    boolean go_ahead;

     //store text in image
    public void Encode(String path, String text, int NumberOfBit) {
        try {
            orginImage = ImageIO.read(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(Hide_sentence.class.getName()).log(Level.SEVERE, null, ex);
        }
        width = orginImage.getWidth();
        height = orginImage.getHeight();
        my_text = text + "^";
        char_array = my_text.getBytes();
        char_array_size = char_array.length;
        char_counter = 0;
        newpixels = new String();
        for (int i = 0; i < width && char_counter < char_array_size; i++) {
            int c = 0;
            for (int j = 0; j < height && char_counter < char_array_size; j++) {
                pixel = orginImage.getRGB(i, j);
                b = dectobin(pixel, 32);
                c++;
                if (NumberOfBit == 1) {
                    if (c % 3 == 0) {
                        threepixel = temp + b;

                        newpixels = injectCharacterInOneBit(char_array[char_counter], threepixel);

                        char_counter++;
                        int c1 = binToDec(newpixels.substring(0, 32));
                        int c2 = binToDec(newpixels.substring(32, 64));
                        int c3 = binToDec(newpixels.substring(64, 96));

                        orginImage.setRGB(i, j - 2, c1);
                        orginImage.setRGB(i, j - 1, c2);
                        orginImage.setRGB(i, j, c3);

                        temp = "";
                    } else {
                        temp += b;
                    }
                } else if (NumberOfBit == 2) {
                    if (c % 2 == 0) {
                        Twopixel = temp + b;

                        newpixels = injectCharacterInTwoBit(char_array[char_counter], Twopixel);
                        char_counter++;
                        int c1 = binToDec(newpixels.substring(0, 32));
                        int c2 = binToDec(newpixels.substring(32));
                        orginImage.setRGB(i, j - 1, c1);
                        orginImage.setRGB(i, j, c2);

                        temp = "";
                    } else {
                        temp += b;
                    }
                } else if (NumberOfBit == 3) {

                    onepixel = b;
                    newpixels = injectCharacterInThreeBit(char_array[char_counter], onepixel);
                    char_counter++;
                    int c1 = binToDec(newpixels.substring(0, 32));
                    orginImage.setRGB(i, j, c1);
                    temp = "";

                }
            }
        }
        File outImage = new File(("newImage.png"));
        try {
            ImageIO.write(orginImage, "png", outImage);
        } catch (IOException e) {
            Logger.getLogger("this image").log(Level.SEVERE, null, e);
        }

    }
//retrive text from Image

    public String decode(String path, int NumberOfBit) {
        temp = "";
        orginImage = readImage(path);
        width = orginImage.getWidth();
        height = orginImage.getHeight();
        char c;
        plain_text = "";
        go_ahead = true;
        for (int i = 0; i < width && go_ahead; i++) {
            int z = 0;
            for (int j = 0; j < height && go_ahead; j++) {
                z++;
                pixel = orginImage.getRGB(i, j);
                b = dectobin(pixel, 32);
                if (NumberOfBit == 1) {
                    if (z % 3 == 0) {
                        threepixel = temp + b;

                        c = retriveDataFromOneBit(threepixel);
                        if (c == '^') {
                            go_ahead = false;
                        } else {
                            plain_text += c;
                        }
                        temp = "";
                    } else {
                        temp += b;
                    }
                } else if (NumberOfBit == 2) {
                    if (z % 2 == 0) {
                        Twopixel = temp + b;
                        c = retriveDataFromTwoBit(Twopixel);
                        if (c == '^') {
                            go_ahead = false;
                        } else {
                            plain_text += c;
                        }
                        temp = "";
                    } else {
                        temp += b;
                    }
                } else if (NumberOfBit == 3) {

                    Twopixel = b;
                    c = retriveDataFromThreeBit(Twopixel);
                    if (c == '^') {
                        go_ahead = false;
                    } else {
                        plain_text += c;
                    }
                    temp = "";

                }
            }
        }

        return plain_text;
    }

    public BufferedImage readImage(String path) 
    {
        BufferedImage res = null;
        try {
            res = ImageIO.read(new BufferedInputStream(new FileInputStream(path)));
        } catch (Exception e) {

        }
        return res;
    }

}
