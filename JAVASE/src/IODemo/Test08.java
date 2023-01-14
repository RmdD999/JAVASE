package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) throws IOException {
        /*
        将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作？
         */

        Student s1 = new Student("Zhangsan",21,"Nanjing");
        Student s2 = new Student("Lisi",26,"Tianjin");
        Student s3 = new Student("Zhaowo",35,"Suzhou");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ObjectOutputStream oos = new  ObjectOutputStream(
                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/test08.txt")
        );
        oos.writeObject(list);

        oos.close();
    }
}
