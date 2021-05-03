package home_page;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class page extends javax.swing.JFrame {

    public boolean cat1=false, cat2=false, cat3=false, cat4=false, cat5=false, cat6=false, sh=false;
    public String []Words; public int WordsSize=0; static String path,le_path,fi_path; 
    public page() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
        Toolkit t=Toolkit.getDefaultToolkit();
        int x=(int) t.getScreenSize().getWidth();
        int y= (int) t.getScreenSize().getHeight();
        this.setSize(x, y);
        
        textpane.setText("the main goal in the game is: Find out the hidden word in the picture (hide in one ,two or three bits)"
                + " by assembling the puzzle");
        textpane.setLineWrap(true);
        textpane.setEditable(false);
        //System.out.println("x: "+x+ "  y: "+y);
    }
    static String file_path1(){
        return path;
    }
    static String file_path2(){
        return le_path;
    }
    static String file_path3(){
        return fi_path;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pn = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textpane = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sport = new javax.swing.JLabel();
        food = new javax.swing.JLabel();
        movies = new javax.swing.JLabel();
        actors = new javax.swing.JLabel();
        places = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        singers = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 36, 49));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel1.setForeground(new java.awt.Color(34, 36, 49));

        jLabel2.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Steganography Game");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\EGYPT\\Desktop\\image_puzzle\\23-512.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(34, 36, 49));
        jButton1.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Start");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Exit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        pn.setBackground(new java.awt.Color(34, 36, 49));
        pn.setForeground(new java.awt.Color(34, 36, 49));

        textpane.setBackground(new java.awt.Color(34, 36, 49));
        textpane.setColumns(20);
        textpane.setFont(new java.awt.Font("Forte", 1, 18)); // NOI18N
        textpane.setForeground(new java.awt.Color(204, 204, 204));
        textpane.setRows(5);
        jScrollPane2.setViewportView(textpane);

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/moves.jpg"))); // NOI18N
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/food.jpg"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/sport.jpg"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/actor.jpg"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/univer.jpg"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        sport.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        sport.setForeground(new java.awt.Color(34, 36, 49));
        sport.setText("Sport");

        food.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        food.setForeground(new java.awt.Color(34, 36, 49));
        food.setText("Food");

        movies.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        movies.setForeground(new java.awt.Color(34, 36, 49));
        movies.setText("Movies");

        actors.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        actors.setForeground(new java.awt.Color(34, 36, 49));
        actors.setText("Actors");

        places.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        places.setForeground(new java.awt.Color(34, 36, 49));
        places.setText("Places");

        jLabel3.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 36, 49));
        jLabel3.setText("Choose The Categore");
        jLabel3.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 50));
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/singer.jpg"))); // NOI18N
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        singers.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        singers.setForeground(new java.awt.Color(34, 36, 49));
        singers.setText("Singers");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(actors)))
                                .addGap(123, 123, 123)
                                .addComponent(places))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(singers)
                                .addGap(128, 128, 128))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(food)
                        .addGap(336, 336, 336)
                        .addComponent(sport)
                        .addGap(289, 289, 289)
                        .addComponent(movies)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(food)
                            .addComponent(sport)
                            .addComponent(movies))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(places)
                            .addComponent(actors)
                            .addComponent(singers))
                        .addGap(214, 214, 214))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(pn.getLocation().x<-5)
            pn.setLocation(9, 100);
        else
            pn.setLocation(-5000, 90);
 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
//        int w = JOptionPane.YES_NO_OPTION;
//       res = JOptionPane.showConfirmDialog(null, "you went Exit?","Exit",w);
//        if(res==0) int 
            System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked
    
    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN));
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN));
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN));
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN));
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        cat1=true; cat2=false; cat3=false; cat4=false; cat5=false; cat6=false;
        food.setForeground(Color.RED);
        sport.setForeground(new java.awt.Color(34,36,49));
        movies.setForeground(new java.awt.Color(34,36,49));
        actors.setForeground(new java.awt.Color(34,36,49));
        places.setForeground(new java.awt.Color(34,36,49));
        singers.setForeground(new java.awt.Color(34,36,49));
        path="food.txt";
        le_path="food level.txt";
        fi_path="food final level.txt";
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        cat1=false; cat2=true; cat3=false; cat4=false; cat5=false; cat6=false;
        food.setForeground(new java.awt.Color(34,36,49));
        sport.setForeground(Color.RED);
        movies.setForeground(new java.awt.Color(34,36,49));
        actors.setForeground(new java.awt.Color(34,36,49));
        places.setForeground(new java.awt.Color(34,36,49));
        singers.setForeground(new java.awt.Color(34,36,49));
        path="sport.txt";
        le_path="sport level.txt";
        fi_path="sport final level.txt";
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        cat1=false; cat2=false; cat3=true; cat4=false; cat5=false; cat6=false; cat6=false;
        food.setForeground(new java.awt.Color(34,36,49));
        sport.setForeground(new java.awt.Color(34,36,49));
        movies.setForeground(Color.RED);
        actors.setForeground(new java.awt.Color(34,36,49));
        places.setForeground(new java.awt.Color(34,36,49));
        singers.setForeground(new java.awt.Color(34,36,49));
        path="movies.txt";
        le_path="movies level.txt";
        fi_path="movies final level.txt";
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        cat1=false; cat2=false; cat3=false; cat4=true; cat5=false; cat6=false;
        food.setForeground(new java.awt.Color(34,36,49));
        sport.setForeground(new java.awt.Color(34,36,49));
        movies.setForeground(new java.awt.Color(34,36,49));
        actors.setForeground(Color.RED);
        places.setForeground(new java.awt.Color(34,36,49));
        singers.setForeground(new java.awt.Color(34,36,49));
        path="actors.txt";
        le_path="actors level.txt";
        fi_path="actors final level.txt";
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        cat1=false; cat2=false; cat3=false; cat4=false; cat5=true; cat6=false;
        food.setForeground(new java.awt.Color(34,36,49));
        sport.setForeground(new java.awt.Color(34,36,49));
        movies.setForeground(new java.awt.Color(34,36,49));
        actors.setForeground(new java.awt.Color(34,36,49));
        places.setForeground(Color.RED);
        singers.setForeground(new java.awt.Color(34,36,49));
        path="Places.txt";
        le_path="places level.txt";
        fi_path="places final level.txt";
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
         jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GREEN));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        cat1=false; cat2=false; cat3=false; cat4=false; cat5=false; cat6=true;
        food.setForeground(new java.awt.Color(34,36,49));
        sport.setForeground(new java.awt.Color(34,36,49));
        movies.setForeground(new java.awt.Color(34,36,49));
        actors.setForeground(new java.awt.Color(34,36,49));
        places.setForeground(new java.awt.Color(34,36,49));
        singers.setForeground(Color.RED);
        path="singers.txt";
        le_path="singers level.txt";
        fi_path="singers final level.txt";
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String []w=new String[25]; WordsSize=0;
        for(int i=0;i<25;i++)
            w[i]=new String();
        BufferedReader r = null;
        try {
            r=new BufferedReader(new FileReader(path));
            String line;
            int i=0;
            while((line = r.readLine()) != null){
                w[i]=line;
                i++; WordsSize++;
            }
            Words=new String[WordsSize];
            for(int x=0;x<WordsSize;x++){
                Words[x]=new String();
                Words[x]=w[x];
            }
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(page.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                r.close();
            } catch (IOException ex) {
                Logger.getLogger(page.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        for(int i=0;i<WordsSize;i++)
//            System.out.println(Words[i]);
//        System.out.println("*************************");
        this.setDefaultCloseOperation(page.EXIT_ON_CLOSE);
        this.setVisible(false);
        this.dispose();
        Level_Page p=new Level_Page();
    }//GEN-LAST:event_jButton1MouseClicked
    
    
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
            java.util.logging.Logger.getLogger(page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actors;
    private javax.swing.JLabel food;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel movies;
    private javax.swing.JLabel places;
    private javax.swing.JPanel pn;
    private javax.swing.JLabel singers;
    private javax.swing.JLabel sport;
    private javax.swing.JTextArea textpane;
    // End of variables declaration//GEN-END:variables
}
