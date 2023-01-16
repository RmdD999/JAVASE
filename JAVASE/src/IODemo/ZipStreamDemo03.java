package IODemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //zip folders and files
        File src = new File("/Users/raymonddu/Desktop/沐沐证件");
        File destParent = src.getParentFile();
        File dest = new File(destParent,src.getName() + ".zip");

        //Zip Stream
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        //get files from Src
        toZip(src,zos,src.getName());
        //close
        zos.close();
    }

    /*
    gather all files from src
     */
    public static  void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();

        for (File file : files) {
            if(file.isFile()){
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while((b = fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }
            else{
                toZip(file,zos,name + "\\" + file.getName());
            }

        }
        
    }

}
