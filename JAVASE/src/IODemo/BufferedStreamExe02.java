package IODemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class BufferedStreamExe02 {
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
        ArrayList<String> list = new ArrayList<>();
        while((line = bis.readLine())!=null){
            list.add(line);
        }
        //order
        //number
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1 o2 序号
                int i = Integer.parseInt(o1.split("\\.")[0]);
                int j = Integer.parseInt(o2.split("\\.")[0]);

                return i-j;
            }
        });
        for (String s : list) {
            bos.write(s);
            bos.newLine();
        }
        bos.close();
        bis.close();

    }
}
