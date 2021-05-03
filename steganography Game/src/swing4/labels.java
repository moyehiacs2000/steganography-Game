/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.awt.Point;
import javax.swing.JLabel;

/** 
 *
 * @author lenovo
 */
public class labels extends position {
   public boolean is;
   public boolean small=true;
   public JLabel label;
   public position []p=new position[12];
   
   public labels(){
        is=false;
        p[0]=new position(4,437) ;  
        p[1]=new position(119,436) ;
        p[2]=new position(228,442) ;
        p[3]=new position(-1,509) ; 
        p[4]=new position(114,503) ; 
        p[5]=new position(229,514) ; 
        p[6]=new position(5,583) ; 
        p[7]=new position(120,578) ; 
        p[8]=new position(229,583) ; 
        p[9]=new position(6,648) ;
        p[10]=new position(115,648) ;
        p[11]=new position(222,648) ;
    }
}
