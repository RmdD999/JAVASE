package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
         */

        FileInputStream fis = new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/a.txt");

        int b;

        while((b=fis.read())!=-1){
            System.out.print((char)b);
        }

        fis.close();
    }
}