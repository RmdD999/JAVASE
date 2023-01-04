package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSetDemo01 {
    public static void main(String[] args) throws IOException {
        /*
         字节流读取中文会出现乱码
         ASCII -- 存储英文 查询ASCII--》编码二进制 --》解码 --》转换成十进制
         GBK 国标 ANSI（GBK BIG5 EUC—KR Shift—JS
         Unicode 万国码    UTF - Unicode Transfer Format
         UTF-16 2-4bytes 00000000 01100001
         UTF-32 4bytes 00000000 00000000 00000000 01100001
         UTF-8 1-4bytes  ASCII 1byte 叙利亚 2bytes 中东文字 3bytes others 4bytes

         为什么会有乱码？
         1.读取数据时未完全读取整个汉字
         2.编码和解码时的方式不统一

         如何不产生乱码？
         1 -不要用字节流读取文件
         2 -编码和解码使用同一码表，同一个编码方式
         */

        FileInputStream fis = new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/a.txt");
        FileOutputStream fos = new FileOutputStream("./src/IODemo/copy.txt");
        int b;

        while((b=fis.read())!=-1){
            fos.write(b);
            System.out.print((char)b);
        }

        fis.close();
        fos.close();
    }
}