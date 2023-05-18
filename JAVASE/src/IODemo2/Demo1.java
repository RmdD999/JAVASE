package IODemo2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // create a file by FileOutputStream
        FileOutputStream fileStream = new FileOutputStream("Mygame.txt");

        //write files, but cannot connect to a file directly.
        ObjectOutputStream os = new ObjectOutputStream(fileStream);

        //write these objects to Mygame.ser
        os.writeObject("Hello");
        os.writeObject("Hello1");
        os.writeObject("Hello2");

        os.close();
    }
}
