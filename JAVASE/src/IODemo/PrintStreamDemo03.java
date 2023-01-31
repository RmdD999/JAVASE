package IODemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
        字符打印流
         */

        PrintWriter pw= new PrintWriter(
                new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/ps03.txt"),true);

        pw.println("you are good!");
        pw.print("nihao");
        pw.printf("%s love %s","azhen","aqiang");

        pw.close();
    }
}
