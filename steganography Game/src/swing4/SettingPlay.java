/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class SettingPlay extends JFrame
{
    Hide_sentence hid=new Hide_sentence();
    /**
     * Creates new form drag2
     */ 
         JLabel[]lifes=new JLabel[3];
         ImageIcon lifeImage;
         public int counterTrial=3;
         public  int counter=100;
         public int value;
         labels []realPieces=new labels[12];
         public JLabel score =new JLabel();
         JLabel timerText = new javax.swing.JLabel();
         JLabel appearSentence = new javax.swing.JLabel();  
         JButton exitButton = new javax.swing.JButton();
         static int  LevelNumber=1;   
         boolean isFinished=false;
         movement Movement;
         static String fileWord;
         static String fileFinshedLevels;
         static String fileLevels;
         JButton trials=new JButton();

   

    public void setTrials(JButton trials) 
    {
        this.trials = trials;
    }

    public JButton getTrials()
    {
        return trials;
    }
    public SettingPlay()
    {
       
    }
         public SettingPlay(int LevelNumber, String fileWord,String fileFinshedLevels,String fileLevels) 
         {
            this.LevelNumber =LevelNumber;
            this.fileWord= fileWord;
            this.fileFinshedLevels=fileFinshedLevels;
            this.fileLevels=fileLevels;
            settingFrame();
            exitButton.setBackground(new Color(255, 0, 51));
            exitButton.setFont(new Font("Monospaced", 1, 18)); // NOI18N
            exitButton.setBounds(1450, 760, 100, 50);
            exitButton.setForeground(new java.awt.Color(0, 0, 0));
            exitButton.setText("Exit");
            exitButton.addActionListener(new ActionListener() 
            {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setDefaultCloseOperation(page.EXIT_ON_CLOSE);
                setVisible(false);
                dispose();
                Level_Page p=new Level_Page(fileWord,fileFinshedLevels,fileLevels);
                //System.exit(0);
            }
        });
        trials.setBorder(BorderFactory.createBevelBorder(10));
        trials.setBounds(500, 760, 100, 50);
        score.setBounds(650, 760, 150, 50);
        score.setFont(new java.awt.Font("Modern No. 20", 1, 28));
        score.setText("Score : "+value);
        
        timerText.setFont(new java.awt.Font("Modern No. 20", 1, 48)); // NOI18N
        timerText.setText("Timer");
        timerText.setBounds(1250, 25, 300, 60);
        appearSentence.setBackground(new Color(204, 204, 0));
        appearSentence.setFont(new Font("Footlight MT Light", 1, 48)); // NOI18N
        appearSentence.setForeground(new Color(0, 0, 0));
        appearSentence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appearSentence.setBounds(350, 25, 850, 60);
        appearSentence.setText("?????????????");
        appearSentence.setOpaque(true);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int)tk.getScreenSize().getWidth();
        int ysize=(int)tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
     
        //int []x=UniqueRandom.UniqueRandom(500, 1050,12);
        //int []y=UniqueRandom.UniqueRandom(100, 650,12);  
      int []x=random.randomX();
      int []y=random.randomY();  
      int []SizeX=UniqueRandom.UniqueRandom(15, 27,12);
      int []SizeY=UniqueRandom.UniqueRandom(10, 22,12);
      int [] random_bit;//
      int [] random_bit_number;//read number Image
      
      //start
      
        Write_File file=new Write_File (fileWord,fileFinshedLevels,fileLevels);
   
        try {
            file.Read_all();
        } catch (IOException ex) {
            Logger.getLogger(SettingPlay.class.getName()).log(Level.SEVERE, null, ex);
        }
        int level=file.ReadLevels();
         String hiden_Sentance="";
        if(LevelNumber<level){
            try {
                file.ReadFinshedLevels();
            } catch (IOException ex) {
                Logger.getLogger(SettingPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
            String equLevel="Level"+String.valueOf(LevelNumber);
            for(int i=0;i<file.FinshedLevelsSize;i++){
                String []Record=file.FinshedLevels[i].split(",");
                if(Record[0].equals(equLevel))
                {
                    hiden_Sentance=Record[1];
                    break;
                }
            }
            isFinished=true;
        }
        else{
        int []sentance_number=UniqueRandom.UniqueRandom(0, file.WordSize-1, 1);
         hiden_Sentance=file.Word[sentance_number[0]];
       
        }
        String [] Sentance_word= hiden_Sentance.split(" ");
        random_bit=random.random(1, 3, Sentance_word.length);
        random_bit_number=random.random(1, 5, Sentance_word.length);
        
        String a=String.valueOf(random_bit[0]);
        String d=String.valueOf(random_bit_number[0]);
        

        //Edit
        ImageOperations operations =new ImageOperations();
             
        for(int i=0;i<12;i++){
                try {
                    realPieces[i]=new labels();
                    int num=i+1;
                    String b = Integer.toString(num);
                    String path=a+"\\"+d+"\\"+b+".png";
                    BufferedImage image=ImageIO.read(new File("src\\swing4\\"+path));
                    
                    image = operations.doTransformations(image);
                    Image piec2=image.getScaledInstance(SizeX[i],SizeY[i], Image.SCALE_DEFAULT);
                    ImageIcon k=new ImageIcon(piec2);
                    realPieces[i].label=new JLabel(k);
                    realPieces[i].label.setBounds(x[i], y[i], SizeX[i], SizeY[i]);
                    realPieces[i].label.setName(path);        
                    add(realPieces[i].label,0);
                   
                } catch (IOException ex) {
                    Logger.getLogger(SettingPlay.class.getName()).log(Level.SEVERE, null, ex);
                }
       }
        int [] numberOf_photos=UniqueRandom.UniqueRandom(0, file.PuzzleSize-1, Sentance_word.length);
        int []Numberof_Scene=UniqueRandom.UniqueRandom(0, file.SceneSize-1, Sentance_word.length);
        hid.Encode(file.Puzzle[numberOf_photos[0]], Sentance_word[0], random_bit[0]);
        JLabel label2=new JLabel();
        label2.setBounds(10, 450, 360, 300);
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("temp.png")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_REPLICATE);
        ImageIcon i=new ImageIcon(img2);
        label2.setIcon(i);
        /////////////////////////
        JLabel label3=new JLabel();
        label3.setBounds(10, 100, 360, 300);
        ImageIcon myimage2=new ImageIcon(file.Puzzle[numberOf_photos[0]]);
        Image hiden_Image=myimage2.getImage();
        Image hiden_Image2=hiden_Image.getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_REPLICATE);
        ImageIcon h_i=new ImageIcon(hiden_Image2);
        label3.setIcon(h_i);
        //////////////////////////////
        JLabel label4=new JLabel();
        label4.setBounds(500, 100, 1050, 650);
        ImageIcon myimage3=new ImageIcon(file.Scene[Numberof_Scene[0]]);
            //////////////////////////////////////////////////

        Image sceneImage=myimage3.getImage();
        Image sceneImage2=sceneImage.getScaledInstance(label4.getWidth(), label4.getHeight(), Image.SCALE_REPLICATE);
        ImageIcon s_i=new ImageIcon(sceneImage2);
        label4.setIcon(s_i);
        settingLifes();
         Movement=new movement(realPieces,label3,label4,label2,this,appearSentence,file.Puzzle,numberOf_photos,Sentance_word,random_bit,file.WordSize,file.Scene,Numberof_Scene,hiden_Sentance,isFinished,file,random_bit_number,trials,timerText,score,lifes);
        ////////////////////////////////
        
        
        this.add(label3);
        this.add(label2);
        this.add(label4);
        this.add(timerText);
        this.add(exitButton);
        this.add(appearSentence);
        this.add(trials);
        this.add(score);
        
        getContentPane().setBackground(Color.ORANGE);
    }

    
    public JLabel getTimerText() 
    {
        return timerText;
    }

    public void setTimerText(JLabel timerText) {
        this.timerText = timerText;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
     
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
       time.start();
    }                                 

    public int getCounterTime() {
        return counter;
    }

    public void setCounterTime(int counterTime) 
    {
        this.counter = counterTime;
    }
  
   private Timer time=new Timer(1000,new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
           if(counter>0)
           {
               
              counter--;
              Movement.bonus(counter);
             timerText.setText("Time : \n"+counter);
             if(counter==1)
             {
                 Movement.gameOver();
             }
           }
           
        }
        
    });
   public Timer getTime() 
    {
        return time;
    }

    public void setTime(Timer time) {
        this.time = time;
    }
     public void settingFrame()
            {
                this.setUndecorated(true);
            this.setAlwaysOnTop(true);
            this.setResizable(false);
            this.setVisible(true);
            this.initComponents();
            }
     public void settingLifes()
     {

         lifeImage=new ImageIcon("lifeImage.png");
         Image image=lifeImage.getImage();
         Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         lifeImage=new ImageIcon(newimg);
        lifes=new JLabel[3];
        int placeX=10;
         for(int i=0;i<3;i++){
             lifes[i]=new JLabel();
             lifes[i].setIcon(lifeImage);
                      lifes[i].setBounds(placeX, 25, 50, 50);
                      placeX+=60;
                      this.add(lifes[i]);
         }
         
         
     }

            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new SettingPlay(LevelNumber,fileWord,fileFinshedLevels,fileLevels).setVisible(true);
               
            }
            
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
