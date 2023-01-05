package IODemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo02 {
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

        FileReader fr = new FileReader("a.txt");

        char[] chars = new char[2];
        int len;

        //read(chars): 读取数据 解码 强转 三步进行合并了。强转之后的字符放到数组当中
        while((len = fr.read(chars))!= -1){
            System.out.print(new String(chars,0,len));
        }

        fr.close();
    }
}
