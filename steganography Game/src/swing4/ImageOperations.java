/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author HOSSAM
 */

interface operationsOfImage{
    public BufferedImage doTransformations(BufferedImage  piece);
    public BufferedImage flipImageVertical(BufferedImage piece);
    public BufferedImage flipImageHorizontal(BufferedImage piece);
    public BufferedImage flipImageBoth(BufferedImage piece);
    
}
public class ImageOperations implements operationsOfImage{
    private BufferedImage[] rotatedImages;
    
    public ImageOperations(){
        
    }
    /**
     * This method is to apply rotation and flipping to each piece according to random values
     * @param pieces The array of pieces (12 piece)
     * @return The new array of transformed pieces (flipped and rotated)
     */
    @Override
    public BufferedImage doTransformations(BufferedImage piece) {
       // rotatedImages=new BufferedImage[pieces.length];
        Random random=new Random();
       
            int degree =random.nextInt(361);
          //  System.out.println("Image is rotated by "+degree+"degree");
            BufferedImage newImage=rotate(piece,degree);
            
            int flipped=random.nextInt(4);
            switch(flipped){
                case 0:
                    newImage=flipImageHorizontal(newImage);
                    break;
                case 1:
                    newImage=flipImageVertical(newImage);
                    break;
                case 2:
                    newImage=flipImageBoth(newImage);
                    break;
                case 3:
                    //Don't flipping this piece
                    break;
            }
           
            return newImage;
        }
    /**
     * Rotate specific piece according to input degree
     * @param piece the piece of puzzle that needs to be rotated
     * @param degree the angle with degree to rotate piece
     * @return the rotated piece
     */
    private BufferedImage rotate(BufferedImage piece,int degree){
        int w = piece.getWidth();
        int h = piece.getHeight();
        double toRad = Math.toRadians(degree);
        int hPrime = (int) (w * Math.abs(Math.sin(toRad)) + h * Math.abs(Math.cos(toRad)));
        int wPrime = (int) (h * Math.abs(Math.sin(toRad)) + w * Math.abs(Math.cos(toRad)));
        BufferedImage rotatedImage = new BufferedImage(wPrime, hPrime, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = rotatedImage.createGraphics();
        g.translate(wPrime/2, hPrime/2);
        g.rotate(toRad);
        g.translate(-w/2, -h/2);
        g.drawImage(piece, 0, 0, null);
        g.dispose();  // release used resources before g is garbage-collected        
        return rotatedImage;
    }

    /**
     * Make flipping to the piece in vertical
     * @param piece the puzzle piece that need to be flipped
     * @return The flipped piece
     */
    @Override
    public BufferedImage flipImageVertical(BufferedImage piece) {
        AffineTransform affineTransform=AffineTransform.getScaleInstance(1, -1);
        affineTransform.translate(0, -piece.getHeight());
        AffineTransformOp affineTransformOp=new AffineTransformOp(affineTransform,AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return affineTransformOp.filter(piece, null);
    }
    /**
     * Make flipping to the piece in horizontal
     * @param piece the puzzle piece that need to be flipped
     * @return The flipped piece
     */
    @Override
    public BufferedImage flipImageHorizontal(BufferedImage piece) {
        AffineTransform affineTransform=AffineTransform.getScaleInstance(-1, 1);
        affineTransform.translate(-piece.getWidth(), 0);
        AffineTransformOp affineTransformOp=new AffineTransformOp(affineTransform,AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return affineTransformOp.filter(piece, null);
    }
      /**
     * Make flipping to the piece in horizontal and vertical
     * @param piece the puzzle piece that need to be flipped
     * @return The flipped piece
     */
    @Override
    public BufferedImage flipImageBoth(BufferedImage piece) {
        AffineTransform affineTransform=AffineTransform.getScaleInstance(-1, -1);
        affineTransform.translate(-piece.getWidth(), -piece.getHeight());
        AffineTransformOp affineTransformOp=new AffineTransformOp(affineTransform,AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return affineTransformOp.filter(piece, null);
    }
   

   
    
     
    
}
