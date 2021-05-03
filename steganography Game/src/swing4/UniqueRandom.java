/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;
import java.security.SecureRandom;
/**
 *
 * @author lenovo
 */
public class UniqueRandom {
        static int []UniqueRandom(int from,int to,int size){
            int n=to-from+1;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=i;
            }
            int []result =new int[size];
            int x=n;
            SecureRandom rand =new SecureRandom();
            for(int i=0;i<size;i++){
                int k=rand.nextInt(x);
                result[i]=a[k]+from;
                a[k]=a[x-1];
                x--;
            }
           return result; 
        }
        
}
