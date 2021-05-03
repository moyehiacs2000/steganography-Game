package swing4;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Write_File implements WriteFileInterface
{
    private String fileWord;
    private String fileLevels;
    private String fileFinshedLevels;
    private final String filePuzzle="Puzzle.txt";
    private final String fileScene="Scene.txt";
    public String []Word; public int WordSize=0;
    public String[]Puzzle; public int PuzzleSize=0;
    public String[]Scene; public int SceneSize=0;
    public String[]FinshedLevels; public int FinshedLevelsSize=0;
    
    public Write_File()
    {
        Word=new String[25];
        Puzzle=new String[25];
        Scene=new String[25];
        for(int i=0;i<25;i++)
                Word[i]=new String();
        for(int i=0;i<25;i++)
                Puzzle[i]=new String();
        for(int i=0;i<25;i++)
                Scene[i]=new String();
    }
    
    public Write_File(String fileWord,String fileFinshedLevels,String fileLevels ){
        this.fileWord=fileWord;
        this.fileFinshedLevels=fileFinshedLevels;
        this.fileLevels=fileLevels;
        Word=new String[25];
        Puzzle=new String[25];
        Scene=new String[25];
        for(int i=0;i<25;i++)
                Word[i]=new String();
        for(int i=0;i<25;i++)
                Puzzle[i]=new String();
        for(int i=0;i<25;i++)
                Scene[i]=new String();
    }
    
    //1
    @Override
    public void Read_all() throws IOException{
        BufferedReader r = null;
        try {
            r=new BufferedReader(new FileReader(fileWord));
            String line;
            int i=0;
            while((line = r.readLine()) != null){
                Word[i]=line;
                i++; WordSize++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            r.close();
        }
        try {
            r=new BufferedReader(new FileReader(filePuzzle));
            String line;
            int i=0;
            while((line = r.readLine()) != null){
                Puzzle[i]=line;
                i++; PuzzleSize++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            r.close();
        }
        try {
            r=new BufferedReader(new FileReader(fileScene));
            String line;
            int i=0;
            while((line = r.readLine()) != null){
                Scene[i]=line;
                i++; SceneSize++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            r.close();
        }
    }
    //2
    @Override
    public void ReadFinshedLevels() throws IOException
    {
        BufferedReader r = null;
        FinshedLevels=new String[50];
        for(int i=0;i<25;i++)
            FinshedLevels[i]=new String();
         try {
            r=new BufferedReader(new FileReader(fileFinshedLevels));
            String newline;
            int i=0;
            while((newline = r.readLine()) != null){
                FinshedLevels[i]=newline;
                i++; FinshedLevelsSize++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            r.close();
        }
    }
    //3
        @Override
    public int ReadLevels()
    {
        int Number=0;
        try {
            BufferedReader r =new BufferedReader(new FileReader(fileLevels));
             String line;
            try {
                if((line = r.readLine()) != null){
                    Number=Integer.parseInt(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Number;   
    }
        @Override
    public void WriteNumber(int Number,String fileLevels)
    {
         File log = new File(fileLevels);
     try{
        if(log.exists()==false){         
                log.createNewFile();
        }
        PrintWriter out = new PrintWriter(log);
       // PrintWriter out = new PrintWriter(new FileWriter(log, true));
        out.append(Number+"");
        out.close();
    }
     catch(IOException e){
        //System.out.println("COULD NOT WRITE!!");
    } 
     //System.out.println("Succes");
    }
        @Override
    public void writeString(String file,String Sentance){
      File log = new File(file);
     try{
    if(log.exists()==false){         
            log.createNewFile();
    }

     PrintWriter out = new PrintWriter(new FileWriter(log, true));
    out.append(Sentance+"\n");
    out.close();
    }catch(IOException e){
       // System.out.println("COULD NOT WRITE!!");
    } 
    // System.out.println("Succes");
    }
    @Override
    public void RemoveLine(String Line)
    {
        File inputFile = new File(fileWord);
        File tempFile = new File("myTempFile.txt");

        BufferedReader reader=null;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter writer=null; 
        
      
        String lineToRemove = Line;
        String currentLine;
        try {
            writer = new BufferedWriter(new FileWriter(tempFile));
              while((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
                 
            }
                 writer.close(); 
                 reader.close();
                 inputFile.delete();
                 File newfile = new File(fileWord);
                 if(tempFile.renameTo(newfile)){
                   //  System.out.println("Done");
                 }
                 
        } catch (IOException ex) {
            Logger.getLogger(Write_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }

    public String getFileWord() {
        return fileWord;
    }

    public void setFileWord(String fileWord) {
        this.fileWord = fileWord;
    }

    public String getFileLevels() {
        return fileLevels;
    }

    public void setFileLevels(String fileLevels) {
        this.fileLevels = fileLevels;
    }

    public String getFileFinshedLevels() {
        return fileFinshedLevels;
    }

    public void setFileFinshedLevels(String fileFinshedLevels) {
        this.fileFinshedLevels = fileFinshedLevels;
    }
    
}
