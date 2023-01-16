package IODemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*
        压缩流
         */

        File src = new File("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/copy.txt");
        File dest = new File("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/");

        toZip(src,dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"copy.zip")));
        //Zip entry object

        ZipEntry entry = new ZipEntry("copy.txt");
        zos.putNextEntry(entry);

        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b=fis.read())!=-1){
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();
    }
}
