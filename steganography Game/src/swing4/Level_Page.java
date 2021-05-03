/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author EGYPT
 */
public class Level_Page extends javax.swing.JFrame {
      static String fileWord;
      static String fileFinshedLevels;
      static String fileLevels;
      public Write_File w;
    /**
     * Creates new form Level_Page
     */
    SettingPlay d;
    public Level_Page(String fileWord,String fileFinshedLevels,String fileLevels) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
        this.fileWord =fileWord;
        this.fileFinshedLevels= fileFinshedLevels;
        this.fileLevels=fileLevels;
        //System.out.println(fileLevels);
        w=new Write_File(fileWord,fileFinshedLevels,fileLevels);
        Toolkit t=Toolkit.getDefaultToolkit();
        int x=(int) t.getScreenSize().getWidth();
        int y= (int) t.getScreenSize().getHeight();
        this.setSize(x, y);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(1,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(2,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(3,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(4,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(5,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(6,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(7,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(8,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(9,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(10,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(11,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(12,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(13,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(14,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(15,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(16,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(17,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(18,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(19,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
        jButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              d=new SettingPlay(20,fileWord,fileFinshedLevels,fileLevels);
                   d.setVisible(true);
                   setVisible(false);}
          });
               if(w.ReadLevels()<2){
             jButton2.setEnabled(false);
         }
          if(w.ReadLevels()<3){
             jButton3.setEnabled(false);
         }if(w.ReadLevels()<4){
             jButton4.setEnabled(false);
         } if(w.ReadLevels()<5){
             jButton5.setEnabled(false);
         } if(w.ReadLevels()<6){
             jButton6.setEnabled(false);
         } if(w.ReadLevels()<7){
             jButton7.setEnabled(false);
         } if(w.ReadLevels()<8){
             jButton8.setEnabled(false);
         } if(w.ReadLevels()<9){
             jButton9.setEnabled(false);
         } if(w.ReadLevels()<10){
             jButton10.setEnabled(false);
         } if(w.ReadLevels()<11){
             jButton11.setEnabled(false);
         } if(w.ReadLevels()<12){
             jButton12.setEnabled(false);
         } if(w.ReadLevels()<13){
             jButton13.setEnabled(false);
         } if(w.ReadLevels()<14){
             jButton14.setEnabled(false);
         } if(w.ReadLevels()<15){
             jButton15.setEnabled(false);
         } if(w.ReadLevels()<16){
             jButton16.setEnabled(false);
         }if(w.ReadLevels()<17){
             jButton17.setEnabled(false);
         }if(w.ReadLevels()<18){
             jButton18.setEnabled(false);
         }if(w.ReadLevels()<19){
             jButton19.setEnabled(false);
         }if(w.ReadLevels()<20){
             jButton20.setEnabled(false);
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 36, 49));

        jPanel1.setBackground(new java.awt.Color(34, 36, 49));

        jButton1.setBackground(new java.awt.Color(34, 36, 49));
        jButton1.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Level 1");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton2.setBackground(new java.awt.Color(34, 36, 49));
        jButton2.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Level 2");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton3.setBackground(new java.awt.Color(34, 36, 49));
        jButton3.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Level 3");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton4.setBackground(new java.awt.Color(34, 36, 49));
        jButton4.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 0));
        jButton4.setText("Level 4");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton5.setBackground(new java.awt.Color(34, 36, 49));
        jButton5.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 153, 0));
        jButton5.setText("Level 5");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton6.setBackground(new java.awt.Color(34, 36, 49));
        jButton6.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 153, 0));
        jButton6.setText("Level 6");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton7.setBackground(new java.awt.Color(34, 36, 49));
        jButton7.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 153, 0));
        jButton7.setText("Level 7");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton8.setBackground(new java.awt.Color(34, 36, 49));
        jButton8.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 153, 0));
        jButton8.setText("Level 8");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton9.setBackground(new java.awt.Color(34, 36, 49));
        jButton9.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 153, 0));
        jButton9.setText("Level 9");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton10.setBackground(new java.awt.Color(34, 36, 49));
        jButton10.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 153, 0));
        jButton10.setText("Level 10");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton11.setBackground(new java.awt.Color(34, 36, 49));
        jButton11.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 153, 0));
        jButton11.setText("Level 11");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton12.setBackground(new java.awt.Color(34, 36, 49));
        jButton12.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 153, 0));
        jButton12.setText("Level 12");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton13.setBackground(new java.awt.Color(34, 36, 49));
        jButton13.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 153, 0));
        jButton13.setText("Level 13");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton14.setBackground(new java.awt.Color(34, 36, 49));
        jButton14.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 153, 0));
        jButton14.setText("Level 14");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton15.setBackground(new java.awt.Color(34, 36, 49));
        jButton15.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 153, 0));
        jButton15.setText("Level 15");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton16.setBackground(new java.awt.Color(34, 36, 49));
        jButton16.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 153, 0));
        jButton16.setText("Level 16");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton17.setBackground(new java.awt.Color(34, 36, 49));
        jButton17.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 153, 0));
        jButton17.setText("Level 17");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton18.setBackground(new java.awt.Color(34, 36, 49));
        jButton18.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 153, 0));
        jButton18.setText("Level 18");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton19.setBackground(new java.awt.Color(34, 36, 49));
        jButton19.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 153, 0));
        jButton19.setText("Level 19");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton20.setBackground(new java.awt.Color(34, 36, 49));
        jButton20.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 153, 0));
        jButton20.setText("Level 20");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton22.setBackground(new java.awt.Color(204, 0, 0));
        jButton22.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jButton22.setForeground(new java.awt.Color(204, 204, 204));
        jButton22.setText("Exit");
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(34, 36, 49));
        jLabel1.setFont(new java.awt.Font("Forte", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Steganography Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(709, 709, 709))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(140, 140, 140)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(147, 147, 147)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(155, 155, 155)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(155, 155, 155)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(166, 166, 166))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        // TODO add your handling code here:
        this.setDefaultCloseOperation(Level_Page.EXIT_ON_CLOSE);
        this.setVisible(false);
        this.dispose();
        //System.exit(0);
        page x=new page();
    }//GEN-LAST:event_jButton22MouseClicked

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
            java.util.logging.Logger.getLogger(Level_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level_Page(fileWord,fileFinshedLevels,fileLevels).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
