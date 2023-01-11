package IODemo;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        利用转换流按照指定字节编码读取
         */

        //create
//        InputStreamReader isr = new InputStreamReader(
//                new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/gbk.txt"),"UTF-8");
//
//        int ch;
//        while((ch = isr.read())!=-1){
//            System.out.println((char)ch);
//        }
//
//        isr.close();

        FileReader fr = new FileReader("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/gbk.txt", Charset.forName("GBK"));

        int ch;
        while((ch = fr.read())!=-1){
            System.out.println((char)ch);
        }

        fr.close();
    }
}
