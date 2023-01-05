package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
        Create instance
        public FileWriter(File file)
        public FileWriter(String pathname)
        public FileWriter(File file, boolean append)
        public FileWriter(String pathname, boolean append)

        read data
        void write(int c)
        void write(String str)
        void write(String str, int off, int len)
        void write(char[] cbuf)
        void write(char[] cbuf, int off, int len)

        release
        public void close()

        我 - 25105
         */

        //字节流 每次操作一个字节
//        FileOutputStream fos = new FileOutputStream("a.txt");
//        fos.write(100);
//        fos.close();

        FileWriter fw = new FileWriter("a.txt");
//        fw.write(25105); //根据字符集的编码方式进行编码，把编码之后的数据写到文件去
//        fw.write("Nihao!!\r");

        char[] chars = {'a','b','c','d'};
        fw.write(chars,0,2);
        fw.write("Nishiyigehaorenya",0,8);
        fw.close();
    }
}
