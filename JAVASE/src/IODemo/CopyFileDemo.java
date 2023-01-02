package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //FileInputStream 一次只读取一个字节
        FileInputStream fis = new FileInputStream("/Users/raymonddu/Desktop/test1.JPG");
        FileOutputStream fos = new FileOutputStream("JAVASE\\test1.JPG");

        //copy
        long startTime = System.currentTimeMillis();//get start time.
        int b;
        while((b = fis.read())!=-1){
            fos.write(b);
        }
        long endTime = System.currentTimeMillis();//get end time;
        System.out.println("copying this file took "+(endTime-startTime)+"ms");

        //先开的流最后关闭
        fos.close();
        fis.close();
    }
}
