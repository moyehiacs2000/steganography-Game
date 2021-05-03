/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Tayba
 */
public class wait {
   public static int SecondsPassed=0;
            Timer myTime=new Timer();
            TimerTask task=new TimerTask() {
                @Override
                public void run() {
                   SecondsPassed++;
                  // System.out.println(SecondsPassed);
                }
            };
         public void start(){
              myTime.scheduleAtFixedRate(task, 1000, 1000);
         }

    public static void setSecondsPassed(int SecondsPassed) {
        wait.SecondsPassed = SecondsPassed;
    }
         
       
}
