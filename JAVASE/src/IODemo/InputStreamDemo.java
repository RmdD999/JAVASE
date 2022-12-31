package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        //if no file matched, will throw exception.
        //there won't be create a new file when input
        //读取到文件末尾如果没有数据 则会返回-1
        FileInputStream fis = new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a.txt");
        byte[] res = fis.readAllBytes();
        fis.close();
        System.out.println(res);
    }
}
