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
abstract class CharOperation implements OperationOnChar {

    @Override
    public String dectobin(int in, int size) 
    {
        String res;
        if (in < 0) {
            in = in + 1;
        }
        res = Integer.toBinaryString(in);
        while (res.length() < size) {
            res = "0" + res;
        }
        return res;
    }

    //to store char in bits

    @Override
    public String injectCharacterInOneBit(byte b, String pixels) {
        String res = "";
        String bstring = this.dectobin(b, 8);
        int c = 0;
        for (int i = 0; i < 96; i = i + 8) {
            if (i % 32 == 0) {
                res = res += pixels.substring(i, i + 8);
                continue;
            }
            if (c > 7) {
                res = res += pixels.substring(i, i + 8);
            } else {
                res = res += pixels.substring(i, i + 7) + bstring.charAt(c);
            }
            c++;
        }
        return res;
    }

    @Override
    public String injectCharacterInTwoBit(byte b, String pixels) {
        String res = "";
        String bstring = this.dectobin(b, 8);
        int c = 0;
        for (int i = 0; i < 64; i = i + 8) {
            if (i % 32 == 0) {
                res = res += pixels.substring(i, i + 8);
                continue;
            }
            if (c > 7) {
                res = res += pixels.substring(i, i + 8);
            } else {
                res = res += pixels.substring(i, i + 6) + bstring.charAt(c) + bstring.charAt(c + 1);
            }
            c += 2;
        }
        return res;
    }

    @Override
    public String injectCharacterInThreeBit(byte b, String pixels) {
        String res = "";
        String bstring = this.dectobin(b, 8);
        int c = 0;
        for (int i = 0; i < 32; i = i + 8) {
            if (i % 32 == 0) {
                res = res += pixels.substring(i, i + 8);
                continue;
            }
            if (i < 24) {
                res = res += pixels.substring(i, i + 5);
                res = res += bstring.charAt(c);
                res = res += bstring.charAt(c + 1);
                res = res += bstring.charAt(c + 2);
            } else {
                res = res += pixels.substring(i, i + 6) + bstring.charAt(c) + bstring.charAt(c + 1);
            }
            c += 3;
        }
        return res;
    }

    //from binary to decimal

    @Override
    public int binToDec(String in) {
        int res = 0;
        for (int i = 0; i < in.length(); i++) {
            String t = new String("" + in.charAt(i));
            int t1 = Integer.parseInt(t);
            int t2 = (int) Math.pow(2, in.length() - i - 1);
            res = res + (t1 * t2);
        }
        return res;
    }

    //to return char from bits

    @Override
    public char retriveDataFromOneBit(String pixels) {
        char c = 0;
        String res = "";
        for (int i = 0; i < 88; i = i + 8) {
            if (i % 32 == 0) {
                continue;
            }
            res += pixels.charAt(i + 7);
        }
        c = (char) this.binToDec(res);

        return c;
    }

    @Override
    public char retriveDataFromTwoBit(String pixels) {
        char c = 0;
        String res = "";
        for (int i = 0; i < 48; i = i + 8) {
            if (i % 32 == 0) {
                continue;
            }
            res += pixels.charAt(i + 6);
            res += pixels.charAt(i + 7);
        }
        c = (char) this.binToDec(res);

        return c;
    }

    @Override
    public char retriveDataFromThreeBit(String pixels) {
        char c = 0;
        String res = "";
        for (int i = 0; i < 32; i = i + 8) {
            if (i % 32 == 0) {
                continue;
            }
            if (i < 24) {
                res += pixels.charAt(i + 5);
                res += pixels.charAt(i + 6);
                res += pixels.charAt(i + 7);
            } else {
                res += pixels.charAt(i + 6);
                res += pixels.charAt(i + 7);
            }
        }
        c = (char) this.binToDec(res);

        return c;
    }

}
