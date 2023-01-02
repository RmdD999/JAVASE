package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    public static void main(String[] args) throws IOException {

        //JDK7 try catch
        try(FileInputStream fis = new FileInputStream("/Users/raymonddu/Desktop/IMG_2065.MOV");
            FileOutputStream fos = new FileOutputStream("JAVASE\\copy.MOV");
        ){
            //copy
            int len;
            byte[] bytes = new byte[1024*1024*5];
            while ((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


//        fos.close();
//        fis.close();
    }
}
