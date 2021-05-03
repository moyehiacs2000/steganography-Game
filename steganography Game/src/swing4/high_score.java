/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ahmed khiry
 */
public class high_score extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    int[]scores=new int[3];
    JButton b ;
     high_score()
     {
       this.setLayout(null);
       this.setExtendedState(Frame.MAXIMIZED_BOTH);
       
       this.setUndecorated(true);
     this.setVisible(true);  
     this.setResizable(false);
     this.setExtendedState(Frame.MAXIMIZED_BOTH);
      this.getContentPane().setBackground(Color.DARK_GRAY);
     l1=new JLabel("Highest Scores");
     
     Font f=new Font("forte",Font.BOLD,120);
     l1.setFont(f);
     l1.setForeground(Color.YELLOW);
     l1.setBounds(550, 100, 1500,150);
     this.add(l1);
     Font f2=new Font("forte",Font.PLAIN,50);
      l2=new JLabel("#1:");
      l2.setFont(f2);
      l2.setForeground(Color.YELLOW);
     l2.setBounds(650, 350, 500,50);
     this.add(l2);
     l3=new JLabel("#2:");
      l3.setFont(f2);
      l3.setForeground(Color.YELLOW);
     l3.setBounds(650, 450, 500,50);
     this.add(l3);
     l4=new JLabel("#3:");
      l4.setFont(f2);
      l4.setForeground(Color.YELLOW);
     l4.setBounds(650, 550, 500,50);
     this.add(l4);
     Score score=new Score();
     scores=score.readDataFromFile();
     l5=new JLabel(String.valueOf(scores[0]));
      l5.setFont(f2);
      l5.setForeground(Color.YELLOW);
     l5.setBounds(850, 350, 500,50);
     this.add(l5);
     l6=new JLabel(String.valueOf(scores[1]));
      l6.setFont(f2);
      l6.setForeground(Color.YELLOW);
     l6.setBounds(850, 450, 500,50);
     this.add(l6);
     l7=new JLabel(String.valueOf(scores[2]));
      l7.setFont(f2);
      l7.setForeground(Color.YELLOW);
     l7.setBounds(850, 550, 500,50);
     this.add(l7);
     b=new JButton();
     Font bf=new Font("forte",Font.BOLD,40);
     b.setText("Back");
    b.setBackground(Color.GRAY);
     b.setFont(bf);
     b.setForeground(Color.RED);
     b.setBounds(1100, 700, 150,75);
     this.add(b);
     b.addActionListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b){
        this.setDefaultCloseOperation(page.EXIT_ON_CLOSE);
        this.setVisible(false);
        this.dispose();
        
        page p=new page();
        }
    }
}