package IODemo;

import java.io.*;
import java.util.*;

public class BufferedStreamExe0201 {
    public static void main(String[] args) throws IOException {
        /*
        order in place in file csb.txt and copy to a file
         */

        //create
        BufferedReader bis = new BufferedReader(
                new FileReader("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/csb.txt"));
        BufferedWriter bos = new BufferedWriter(
                new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/csbCopy.txt"));
        //read
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while((line = bis.readLine())!=null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),arr[1]);

        }
        //order
        //number
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bos.write(value);
            bos.newLine();
        }
        
        bos.close();
        bis.close();

    }
}
