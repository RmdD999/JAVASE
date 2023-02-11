package ThreadDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

//
public class SleepDemo02 {

    public void tenDown() throws InterruptedException {
         int num = 10;

         while(true){
             Thread.sleep(1000);
             if(num>=0)
             {
                 System.out.println(num--);
             }
             else{
                 break;
             }
         }
    }

    public static void main(String[] args) throws InterruptedException {
//        SleepDemo02 sd = new SleepDemo02();
//        sd.tenDown();
        Date startTime = new Date(System.currentTimeMillis());

        while(true){
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
            startTime = new Date(System.currentTimeMillis());
        }

    }
}
