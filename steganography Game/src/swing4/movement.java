/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.util.Random;
import java.security.SecureRandom;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class movement extends SettingPlay implements MouseListener, MouseMotionListener {

    Hide_sentence hid = new Hide_sentence();
    int cnt = 0;
    int liferemoved=2;
    private int x, y;
    JLabel photo, scene, puzzle;
    labels[] realPieces = new labels[12];
    JLabel[] loseHearts=new JLabel[3];
    JFrame frame;
    JLabel textlabel;
    int num_word = 2;
    String[] photos;
    int[] numberOf_photos;
    String[] Scenes;
    int[] Numberof_Scenes;
    String[] Sentance_word;
    int[] random_bit;
    int[] random_bit_Number;
    int index = 0;
    String hiden_sentance = "";
    int word_size;
    int[] SizeX;
    int[] SizeY;
    private String hiden_Sentance;
    private Write_File file_fun;
    private boolean isFinished;
    public static boolean win;
    private String file_Levels;

    
    public movement(labels[] realPieces, JLabel photo, JLabel scene, JLabel puzzle, JFrame frame, JLabel textlabel, String[] photos, int[] numberOf_photos,
            String[] Sentance_word, int[] random_bit, int word_size, String[] Scenes, int[] Numberof_Scenes, String hiden_Sentance, boolean isFinished, Write_File file_fun, int[] random_bit_Number, JButton trials, JLabel timerText
    ,JLabel score,JLabel lifes[]) 
    {
        //super();
        this.score=score;
        win = false;
        this.loseHearts=lifes;
        this.photo = photo;
        this.scene = scene;
        this.puzzle = puzzle;
        this.realPieces = realPieces;
        this.frame = frame;
        this.textlabel = textlabel;
        this.photos = photos;
        this.random_bit_Number = random_bit_Number;
        this.numberOf_photos = numberOf_photos;
        this.Sentance_word = Sentance_word;
        this.random_bit = random_bit;
        this.word_size = word_size;
        this.Scenes = Scenes;
        this.Numberof_Scenes = Numberof_Scenes;
        this.hiden_Sentance = hiden_Sentance;
        this.isFinished = isFinished;
        this.file_fun = file_fun;
        this.timerText=timerText;
        this.trials=trials;
        trials.setText(Integer.toString(counterTrial));
        trials.setBackground(Color.yellow);
        trials.addActionListener((ActionEvent ae) -> {
            helper();
        });

        for (labels piece : realPieces) 
        {

            piece.label.addMouseListener(this);
            piece.label.addMouseMotionListener(this);
        }
        scene.addMouseListener(this);
        SizeX = UniqueRandom.UniqueRandom(15, 27, 12);
        SizeY = UniqueRandom.UniqueRandom(10, 22, 12);

    }

    
    
    
    @Override
    public void mouseClicked(MouseEvent me) {

        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent event) {

        x = event.getX();
        y = event.getY(); 
        boolean isVisited = false;
        for (int i = 0; i < realPieces.length; i++) {
            
            if (realPieces[i].label.getName() == event.getComponent().getName() && realPieces[i].small) {
                realPieces[i].small = false;
                 
                isVisited = true;
                 value+=10;
                 score.setText("Score : "+value);
                realPieces[i].label.setIcon((new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(event.getComponent().getName())))));

                realPieces[i].label.setBounds(event.getComponent().getLocation().x, event.getComponent().getLocation().y, 153, 110);

            }
            else if (realPieces[i].label.getName() == event.getComponent().getName() && !realPieces[i].small) 
            {
               
                isVisited = true;
            }

        }
       
                if (!isVisited) {
            {
                cnt++;
                if(value>=10)
                value-=10;
                loseHearts[liferemoved].setVisible(false);
                this.remove(loseHearts[liferemoved]);
                liferemoved--;
                score.setText("Score : "+value);
                //System.out.print(cnt);
                if(cnt==3)
                {
                    this.win=false;
                    this.gameOver();
                }

            }
        }
               // System.out.println(cnt+" boolean : "+isVisited);
    }

    @Override
    public void mouseReleased(MouseEvent me) {

        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent event) {

        int c = 0;
        for (int i = 0; i < 12; i++) {
            if (realPieces[i].is) {
                c++;
            }
            if (realPieces[i].label.getName().equals(event.getComponent().getName()) && !realPieces[i].is) {
                double dis = Math.sqrt(Math.pow(event.getComponent().getLocation().x - realPieces[i].p[i].x, 2) + Math.pow(event.getComponent().getLocation().y - realPieces[i].p[i].y, 2));
                if (dis < 10) {
                    event.getComponent().setLocation(realPieces[i].p[i].x, realPieces[i].p[i].y);
                    realPieces[i].is = true;
                    value+=15;
                     score.setText("Score : "+value);
                } else {
                    event.getComponent().setLocation((event.getX() + event.getComponent().getX() - x), (event.getY() + event.getComponent().getY() - y));

                }
            }
        }
       // c=12;
        if (index == Sentance_word.length - 1 && c == 12) {
            c = 20;
            cnt=0;
            String s = hid.decode("newImage.png", random_bit[index]);
            hiden_sentance += " ";
            hiden_sentance += s;
            String h_w = " ";
            textlabel.setText(hiden_sentance + h_w);
            index++;
            file_fun.RemoveLine(hiden_Sentance);
            int Number = file_fun.ReadLevels();

            String Record = "Level" + String.valueOf(Number) + "," + hiden_Sentance;
            if (!isFinished) {
                file_fun.writeString(file_fun.getFileFinshedLevels(), Record);
                file_fun.WriteNumber(Number + 1, file_fun.getFileLevels());
            }
            win = true;
            Score highestScore=new Score();
            try 
            {
                highestScore.updateDataInFile(value);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(movement.class.getName()).log(Level.SEVERE, null, ex);
            }
            removeDataOnScreen();
            JLabel winLabel = new JLabel();
            winLabel.setBounds(50, 100, 1500, 650);
            ImageIcon myimage3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("youwin.jpg")));
            Image sceneImage = myimage3.getImage();
            Image sceneImgae2 = sceneImage.getScaledInstance(winLabel.getWidth(), winLabel.getHeight(), Image.SCALE_REPLICATE);
            ImageIcon s_i = new ImageIcon(sceneImgae2);
            winLabel.setIcon(s_i);
            JButton nextLevel = new javax.swing.JButton();
            nextLevel.setBackground(Color.GREEN);
            nextLevel.setFont(new Font("Monospaced", 1, 18)); // NOI18N
            nextLevel.setBounds(100, 760, 100, 50);
            nextLevel.setForeground(new java.awt.Color(0, 0, 0));
            nextLevel.setText("Next");
            nextLevel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Level_Page l = new Level_Page(file_fun.getFileWord(), file_fun.getFileFinshedLevels(), file_fun.getFileLevels());
                    l.setVisible(true);
                    frame.setVisible(false);
                }
            }
            );

            frame.add(nextLevel);
            frame.add(winLabel);
        }

        if (c == 12 && index < Sentance_word.length) {

            c = 0;
            for (int i = 0; i < realPieces.length; i++) {
                frame.remove(realPieces[i].label);
            }
            frame.remove(scene);
            frame.remove(photo);
            frame.remove(puzzle);
            frame.repaint();

            String s = hid.decode("newImage.png", random_bit[index]);
            hiden_sentance += " ";
            hiden_sentance += s;
            String h_w = " ";
            for (int h = index + 1; h < Sentance_word.length; h++) {
                for (int j = 0; j < Sentance_word[h].length(); j++) {
                    h_w += "?";
                }
                h_w += " ";
            }
            textlabel.setText(hiden_sentance + h_w);
            index++;
            String a = String.valueOf(random_bit[index]);
            String d = String.valueOf(random_bit_Number[index]);
            hid.Encode(photos[numberOf_photos[index]], Sentance_word[index], random_bit[index]);

     // int []x=UniqueRandom.UniqueRandom(500, 1050,12);
            //int []y=UniqueRandom.UniqueRandom(100, 650,12);
            int[] x = random.randomX();
            int[] y = random.randomY();

            ImageOperations operations = new ImageOperations();
            for (int i = 0; i < 12; i++) {
                try {
                    realPieces[i] = new labels();
                    int num = i + 1;
                    String b = Integer.toString(num);
                    String path = a + "\\" + d + "\\" + b + ".png";

                    BufferedImage image = ImageIO.read(new File("src\\" + "swing4\\" + path));
                    image = operations.doTransformations(image);
                    Image piec2 = image.getScaledInstance(SizeX[i], SizeY[i], Image.SCALE_DEFAULT);
                    ImageIcon k = new ImageIcon(piec2);
                    realPieces[i].label = new JLabel(k);
                    realPieces[i].label.setBounds(x[i], y[i], SizeX[i], SizeY[i]);
                    realPieces[i].label.setName(path);

                    frame.add(realPieces[i].label, 0);
                    realPieces[i].label.setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(SettingPlay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            scene = new JLabel();
            scene.setBounds(500, 100, 1050, 650);
            ImageIcon myimage3 = new ImageIcon(Scenes[index]);
            Image sceneImage = myimage3.getImage();
            Image sceneImage2 = sceneImage.getScaledInstance(scene.getWidth(), scene.getHeight(), Image.SCALE_REPLICATE);
            ImageIcon imageIcon = new ImageIcon(sceneImage2);
            scene.setIcon(imageIcon);
            frame.add(scene);

            photo = new JLabel();
            photo.setBounds(10, 100, 360, 300);
            ImageIcon myimage2 = new ImageIcon(photos[numberOf_photos[index]]);
            Image hiden_Image = myimage2.getImage();
            Image hiden_Image2 = hiden_Image.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_REPLICATE);
            ImageIcon hiddenImage = new ImageIcon(hiden_Image2);
            photo.setIcon(hiddenImage);
            frame.add(photo);
            puzzle = new JLabel();
            puzzle.setBounds(10, 450, 360, 300);
            ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("temp.png")));
            Image image = myImage.getImage();
            Image newImage = image.getScaledInstance(puzzle.getWidth(), puzzle.getHeight(), Image.SCALE_REPLICATE);
            ImageIcon puzzleImage = new ImageIcon(newImage);
            puzzle.setIcon(puzzleImage);
            frame.add(puzzle);
            for (labels piece : realPieces) {
                piece.label.addMouseListener(this);
                piece.label.addMouseMotionListener(this);
            }
            scene.addMouseListener(this);
        }

    }

    @Override
    public void mouseMoved(MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void gameOver() 
    {
        if (!win) 
        
        {
                        Score highestScore=new Score();
            try 
            {
                highestScore.updateDataInFile(value);
            } catch (IOException ex) 
            {
                Logger.getLogger(movement.class.getName()).log(Level.SEVERE, null, ex);
            }
            removeDataOnScreen();
            JLabel gameOverLabel = new JLabel();
            gameOverLabel.setBounds(50, 100, 1500, 650);
            ImageIcon myimage3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gameover.png")));
            Image sceneImgae = myimage3.getImage();
            Image sceneImgae2 = sceneImgae.getScaledInstance(gameOverLabel.getWidth(), gameOverLabel.getHeight(), Image.SCALE_REPLICATE);
            ImageIcon s_i = new ImageIcon(sceneImgae2);
            gameOverLabel.setIcon(s_i);
            JButton tryagianButton = new javax.swing.JButton();
            tryagianButton.setBackground(Color.GREEN);
            tryagianButton.setFont(new Font("Monospaced", 1, 18)); // NOI18N
            tryagianButton.setBounds(100, 760, 200, 50);
            tryagianButton.setForeground(new java.awt.Color(0, 0, 0));
            tryagianButton.setText("Try Again");
            tryagianButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Level_Page l = new Level_Page(file_fun.getFileWord(), file_fun.getFileFinshedLevels(), file_fun.getFileLevels());
                    l.setVisible(true);
                    frame.setVisible(false);
                }
            });
            frame.add(tryagianButton);
            frame.add(gameOverLabel);
        }
    }

    private void helper() 
    {
        if (counterTrial > 0) 
        {
            Random random = new Random();
            int storeIndex = -1;
            while (true) {
                int index = random.nextInt(12);
                if (realPieces[index].small) {
                    storeIndex = index;
                    break;
                }
            }
            if(value>=5)
            value-=5;
            counterTrial--;
            getTrials().setText(Integer.toString(counterTrial));
            realPieces[storeIndex].small = false;
            realPieces[storeIndex].label.setIcon((new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(realPieces[storeIndex].label.getName())))));
            realPieces[storeIndex].label.setBounds(realPieces[storeIndex].label.getLocation().x, realPieces[storeIndex].label.getLocation().y, 153, 110);
        }
    }
    public void bonus(int counter)
    {
        if(win)
        {
            if(counter<=100&&counter>80)
            {
              value+=10;
            }
            else if(counter<=80&&counter>60)
            {
                value+=8;
            }
 else if(counter<=60&&counter>40)
            {
                value+=6;
            }
             else if(counter<=40&&counter>20)
            {
                value+=4;
            }
             else if(counter<=20&&counter>=2)
            {
                value+=2;
            }
        }
        score.setText("Score : "+value);
    }

    private void removeDataOnScreen() {
        for (int i = 0; i < realPieces.length; i++) {
            frame.remove(realPieces[i].label);
        }
        frame.remove(scene);
        frame.remove(photo);
        frame.remove(puzzle);
        frame.remove(score);
        frame.remove(trials);
        timerText.setVisible(false);
        frame.remove(timerText);
        getTime().stop();
        frame.repaint();
    }

}
