package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        利用反序列化流/对象操作输入流，把文件中中的对象读到程序中

        public ObjectInputStream(InputStream out)

        public Object readObject()
         */

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a.txt"));

        Student o = (Student)ois.readObject();
        System.out.println(o);

        ois.close();

    }
}
