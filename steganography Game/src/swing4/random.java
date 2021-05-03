package swing4;

import java.security.SecureRandom;

/**
 *
 * @author Tayba
 */
public class random 
{
    static int []random(int from,int to,int size)
    {
         SecureRandom rand =new SecureRandom();
        int []result =new int[size];
        for(int i=0;i<size;i++){
                int k=rand.nextInt(to-from+1);
                result[i]=k+from;
        }
     return result; 
    }
    

        static int []randomX(){
         int []pos=UniqueRandom.UniqueRandom(0,11,12);
         SecureRandom rand =new SecureRandom();
        
         int []result =new int[12];
        for(int i=0;i<12;i++){
                int k;
                if(i%3==0) k=500+rand.nextInt(280);
                else if(i%3==1) k=860+rand.nextInt(280);
                else k=1200+rand.nextInt(280);
                
                result[pos[i]]=k;

        }
        
     return result; 
    }
         
      static int []randomY(){
         int []pos=UniqueRandom.UniqueRandom(0,11,12);
         SecureRandom rand =new SecureRandom();
        
         int []result =new int[12];
        for(int i=0;i<12;i++){
                int k;
                if(i%4==0) k=100+rand.nextInt(125);
                else if(i%4==1) k=270+rand.nextInt(125);
                
                else if(i%4==2)k=440+rand.nextInt(125);
                
                else k=580+rand.nextInt(125);
                
                result[pos[i]]=k;
        }
                return result;


}
}
