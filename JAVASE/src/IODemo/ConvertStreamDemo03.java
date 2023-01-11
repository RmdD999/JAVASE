package IODemo;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
        将本地文件中的GBK文件，转换成UTF-8
         */

//        InputStreamReader isr = new InputStreamReader(
//                new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/gbk.txt"),"GBK");
//
//        OutputStreamWriter osw = new OutputStreamWriter(
//                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/copy.txt"),"UTF-8");
//
//        int b;
//        while((b=isr.read())!=-1){
//            osw.write(b);
//        }
//
//        osw.close();
//        isr.close();

        FileReader fr = new FileReader("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/gbk.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/copy.txt",Charset.forName("UTF-8"));

        int ch;
        while((ch = fr.read())!=-1){
            fw.write(ch);
        }

        fw.close();
        fr.close();
    }
}
