package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /*
        字节打印流：
        public PrintStream(OutputStream/File/String)
        public PrintStream(String fileName, Charset charset)
        public PrintStream(OutputStreamout, boolean autoFlush)
        public PrintStream(OutputStream out, boolean autoFlush, String encoding)

        void write(int b)
        void println(xxx xx)
        void print(xxx xx)
        void printf(String format, Object args)

         */

        PrintStream ps = new PrintStream(
                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/PrintStreamDemo01.txt"),
                true,"UTF-8");

        ps.println(97);
        ps.println(true);
        ps.printf("%s fell in love with %s","azhen","aqiang");
        ps.close();
    }
}
