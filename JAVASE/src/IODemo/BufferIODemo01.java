package IODemo;

import java.io.*;

public class BufferIODemo01 {
    public static void main(String[] args) throws IOException {
        /*
        缓冲流
        字节缓冲流 -BufferedInputStream 字节缓冲输入流
                  BufferedOutputStream 字节缓冲输出流
        字符缓冲流 -BufferedReader 字符缓冲输入流
                  BufferedWriter 字符缓冲输出流
         */

        //create
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/bis1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/bis1Output.txt"));

        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }

        bos.close();
        bis.close();
    }
}
