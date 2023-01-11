package IODemo;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter osw = new OutputStreamWriter(
//                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/copy.txt"),"GBK"
//        );
//        osw.write("你好你好啊");
//        osw.close();

        FileWriter fw = new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/copy.txt",Charset.forName("GBK"));
        fw.write("你好你好啊");
        fw.close();
    }
}
