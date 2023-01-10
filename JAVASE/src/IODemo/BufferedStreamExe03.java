package IODemo;

import java.io.*;

public class BufferedStreamExe03 {
    public static void main(String[] args) throws IOException {
        /*
        program to let user to use this application 3 times.
        first time : terminal need to display "This is your first time using this program."
        Second time: terminal need to display "This is your second time using this program."
        Third time: terminal need to display "This is your third time using this program."
        Forth and further: display: the program only support you on free using for 3 times, please buy a premium plus to
        continue.
         */

        BufferedReader br = new BufferedReader(
                new FileReader("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a5.txt"));


        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line);
        count++;
        System.out.println(count);
        if(count<=3){
            System.out.println("This is your " + count + " for using this application.");
        }
        else{
            System.out.println("the program only support you on free using for 3 times, please buy a premium plus to\n" +
                    "       continue.");
        }
        //BufferedWriter will erase the file so declare here when you use this and create it
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a5.txt"));
        bw.write(count+"");//write in String

        bw.close();
    }
}
