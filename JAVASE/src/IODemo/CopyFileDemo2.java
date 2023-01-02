package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/a.txt");

        byte[] bytes = new byte[2];

        int len = fis.read(bytes);
        System.out.println(len);//2
        String str = new String(bytes,0,len);//ab
        System.out.println(str);

        int len1 = fis.read(bytes);
        System.out.println(len1);//2
        String str1 = new String(bytes,0,len1);//cd
        System.out.println(str1);

        //第三次只读取了一次数据，所以只覆盖了上一次的c，而d没有被覆盖
        int len2 = fis.read(bytes);
        System.out.println(len2);//1
        String str2 = new String(bytes,0,len2);//ed
        System.out.println(str2);

        //第四次没有读到数据，所以上次的ed没有被覆盖。
//        int len3 = fis.read(bytes);
//        System.out.println(len3);//-1
//        String str3 = new String(bytes);//ed
//        System.out.println(str3);
        fis.close();


    }
}

