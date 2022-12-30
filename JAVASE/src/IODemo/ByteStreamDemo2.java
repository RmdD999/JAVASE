package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/a.txt");

//        fos.write(99);

        byte[] bytes = {99,100,101,102,103};


        fos.write(bytes,1,2);
        fos.close();

    }
}
