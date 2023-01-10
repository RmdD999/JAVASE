package IODemo;

import java.io.*;

public class BufferedStreamExe01 {
    public static void main(String[] args) throws IOException {
        /*
        4 ways of copying file
         */

        File file = new File("/Users/raymonddu/Desktop/Lusan不能看.mp4");

        long start = System.currentTimeMillis();
        method1(file);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000+" secs");

        long start2 = System.currentTimeMillis();
        method2(file);
        long end2 = System.currentTimeMillis();
        System.out.println((end2-start2)/1000+" secs");

        long start3 = System.currentTimeMillis();
        method3(file);
        long end3 = System.currentTimeMillis();
        System.out.println((end3-start3)/1000+" secs");

        long start4 = System.currentTimeMillis();
        method4(file);
        long end4 = System.currentTimeMillis();
        System.out.println((end4-start4)/1000+" secs");
    }

    private static void method1(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file.getAbsolutePath());
        FileOutputStream fos = new FileOutputStream(
                "/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a2Copy.mp4");

        int len;
        while((len=fis.read())!=-1){
            fos.write(len);
        }

        fos.close();
        fis.close();
    }

    private static void method2(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file.getAbsolutePath());
        FileOutputStream fos = new FileOutputStream(
                "/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a2Copy.mp4");
        int len;
        byte[] bytes = new byte[8192];
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }

    private static void method3(File file) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a2Copy.mp4"));

        int len;
        while((len = bis.read())!=-1){
            bos.write(len);
        }

        bos.close();
        bis.close();
    }

    private static void method4(File file) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a2Copy.mp4"));

        int len;
        byte[] bytes = new byte[8192];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
    }

}
