package IODemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        Create
        public FileReader(File file)
        public FileReader(String pathname)

        Read
        public int read() --- return -1 means end
        public int read(char[] buffer)

        Release
        public void close()
         */

        FileReader fr = new FileReader(new File("a.txt"));

        //read()一次读一个字节，中文读取多个，解码 10进制
        int b;
        while((b=fr.read())!=-1){
            System.out.print((char)b);
        }

        fr.close();
    }
}
