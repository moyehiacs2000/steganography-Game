/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

import java.io.IOException;

/**
 *
 * @author User
 */
public interface WriteFileInterface {

    public void Read_all() throws IOException;

    public void ReadFinshedLevels() throws IOException;

    public int ReadLevels();

    public void WriteNumber(int Number, String fileLevels);

    public void writeString(String file, String Sentance);

    public void RemoveLine(String Line);

}
