package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a.txt",true);
        //new line
        String str = "Imthebest\r999";
        fos.write(str.getBytes());
        String str2 = "haha";
        fos.write(str2.getBytes());
        fos.close();
    }
}
