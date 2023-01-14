package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        利用序列化流/对象操作输出流，把一个对象写入本地中

        public ObjectOutputStream(OutputStream out) -基本流变成高级流

        public final void writeObject(Object obj) 把对象序列化 写出 到文件去
         */

        Student stu = new Student("Zhangsan",20,"Nanjing");

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a.txt"));

        oos.writeObject(stu);

        oos.close();
    }
}
