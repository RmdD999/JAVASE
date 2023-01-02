package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        ///Users/raymonddu/Desktop/IMG_2065.MOV
        FileInputStream fis = new FileInputStream("/Users/raymonddu/Desktop/IMG_2065.MOV");
        FileOutputStream fos = new FileOutputStream("JAVASE\\copy.MOV");

        //copy
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }
}
