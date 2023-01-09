package IODemo;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/bis1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/bis1Output.txt"));

        byte[] bytes = new byte[1024];
        int len;

        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
    }
}
