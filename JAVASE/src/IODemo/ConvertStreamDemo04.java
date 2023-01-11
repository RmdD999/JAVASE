package IODemo;

import java.io.*;

public class ConvertStreamDemo04 {
    public static void main(String[] args) throws IOException {
        /*
        利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码

        1 字节流读取中文会出现乱码
        2 没有办法读一整行  -字符缓冲流
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a.txt"))); //readline

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
