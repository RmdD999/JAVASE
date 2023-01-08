package IODemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class IODemo04 {
    public static void main(String[] args) throws IOException {
        //read
        FileReader fr = new FileReader("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a2.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while((len=fr.read())!=-1){
            sb.append((char)len);
        }
        fr.close();
        //sort
        String str = sb.toString();

        ArrayList<Integer> intArr = new ArrayList<>();
        String[] arrStr = str.split("-");
        for (String s : arrStr) {
            int temp = Integer.parseInt(s);
            intArr.add(temp);
        }

        Collections.sort(intArr);

        //write
        FileWriter fw = new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a2Copy.txt");
        for (int i = 0; i < intArr.size(); i++) {
            if(i==intArr.size()-1){
                fw.write(intArr.get(i) + "");//加空字符串可以让数字原样写出
            }
            else{
                fw.write(intArr.get(i) + "-");
            }
        }
        fw.close();
    }
}
