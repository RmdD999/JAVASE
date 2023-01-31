package myZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //file source
        File src = new File("/Users/raymonddu/Desktop/test.mp4.zip");
        //file dest
        File dest = new File("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/myZipStream/");

        unZip(src,dest);
    }

    public static void unZip(File src, File dest) throws IOException {
        //unzip key: read all files or directories from the source and copy to the destination in order
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        //get zip entry object
       ZipEntry entry;
       while((entry=zip.getNextEntry())!=null){
            System.out.println(entry);

            if(entry.isDirectory()){
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }
            else{
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b=zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
       }

        zip.close();

    }
}
