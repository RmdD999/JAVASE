package IODemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/bis1.txt"));
//        String line = br.readLine();
//        String line2 = br.readLine();
//        //readLine() 不会读取回车换行符
//        System.out.println(line);
//        System.out.println(line2);

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}


