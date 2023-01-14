package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/test08.txt")
        );


        ArrayList<Student> res = (ArrayList<Student>)ois.readObject();

        for(Student item:res){
            System.out.println(item);
        }

        ois.close();
    }
}
