package IODemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo03
{
    public static void main(String[] args) throws IOException {
        /*
        字符流缓冲输入法
        Constructor
        public BufferedReader(Reader r)

        public String readLine() //read for a line
         */

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/bis1Output.txt"));

        bw.write("May the joy and happiness always with you");
        bw.newLine();
        bw.write("are you a good person?");
        bw.newLine();
        bw.close();

        /*
        缓冲流为什么提高性能？
        缓冲流自带长度为8192的缓冲区
        显著提高字节流的读写性能
        对于字符流提升不明显

        BufferedReader: readLine()
        BufferWriter: newLine()
         */
    }
}
