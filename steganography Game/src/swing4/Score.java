/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

/**
 *
 * @author User
 */
 
public class Score  {

    File fileScore;
    String fileName;
    Scanner myReader;
    FileWriter writer;
    int[] storeScore;
    int counter;

    public Score() 
    {
        fileName = "HighestScore.txt";
        fileScore = new File(fileName);
        
        storeScore = new int[4];
        counter = 0;
        readDataFromFile();
        

    }

    public int[] readDataFromFile() {
       counter=0;
        try {
            Scanner myReader = new Scanner(fileScore);
            
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                storeScore[counter] = Integer.parseInt(data);
                //.out.println(storeScore[counter]);
                counter++;
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return storeScore;
        

    }

    public void updateDataInFile(int value) throws IOException 
    {
        storeScore[3]=value;
        Arrays.sort(storeScore);
        writer=new FileWriter(fileScore);
       PrintWriter writer = new PrintWriter(fileName);
       writer.print("");
       for(int i=3;i>=1;i--)
       {
       writer.println(storeScore[i]);
       }
       writer.close();

       

    }

  

  

}
