package IODemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        Encode
        public byte[] getBytes()
        public byte[] getBytes(String charsetName)

        Decoding
        String(byte[] bytes)
        String(byte[] bytes, String charsetName)
         */

        String str = "你好呀";
        byte[] bytes = str.getBytes();//utf-8
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        String str2 = new String(bytes);
        System.out.println(str2);

        String str3 = new String(gbks,"GBK");
        System.out.println(str3);

        //字符流 = 字节流 + 字符集
        //Reader - 字符输入流 FileReader
        //Writer - 字符输出流 FileWriter
    }
}
