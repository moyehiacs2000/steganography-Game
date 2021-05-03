/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing4;

/**
 *
 * @author User
 */
public interface OperationOnChar {
   abstract  String dectobin(int in, int size);

   abstract  String injectCharacterInOneBit(byte b, String pixels);

   abstract  String injectCharacterInTwoBit(byte b, String pixels);

  abstract   String injectCharacterInThreeBit(byte b, String pixels);

  abstract   int binToDec(String in);

   abstract  char retriveDataFromOneBit(String pixels);

  abstract   char retriveDataFromTwoBit(String pixels);

   abstract  char retriveDataFromThreeBit(String pixels);

    
}
