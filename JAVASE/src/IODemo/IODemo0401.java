package IODemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class IODemo0401 {
    public static void main(String[] args) throws IOException {
        //read
        FileReader fr = new FileReader("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a3.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while((len=fr.read())!=-1){
            sb.append((char)len);
        }
        fr.close();
        //sort
       Integer[] arr = Arrays.stream(sb.toString().
               split("-"))
               .map(Integer::parseInt)
               .sorted()
               .toArray(Integer[]::new);
        //write
        FileWriter fw = new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a2Copy.txt");
        String s = Arrays.toString(arr).replace(", ","-");
        String substring = s.substring(1, s.length() - 1);
        System.out.println(substring);
        fw.write(substring);

        fw.close();

    }
}
