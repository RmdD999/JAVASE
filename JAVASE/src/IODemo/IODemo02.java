package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo02 {
    public static void main(String[] args) throws IOException {
        /*
        encoding -change byte and save to new file
        decoding -vice versa
        异或 ^ : 两边相同 false， 两边不同 true
        如果为数字 -》 二进制转换
        0 ： false
        1 ： true
        100 ： 11001100
        10 ： 1010

        100: 1100100
        10 : 0001010
        -------------
             1101110
             十进制： 110
        */

        //encoding file
        FileInputStream fis = new FileInputStream("/Users/raymonddu/Desktop/Lusan不能看的视频.mp4");
        //encry file vice versa∂
        FileOutputStream fos = new FileOutputStream("/Users/raymonddu/Desktop/Lusan不能看.mp4");

        //encoding
        int b;

        while (((b=fis.read()))!=-1){
            fos.write(b^8);
        }

        fos.close();
        fis.close();
    }
}
