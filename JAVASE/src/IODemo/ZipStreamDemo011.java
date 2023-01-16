package IODemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo011 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/raymonddu/Desktop/沐沐证件.zip");
        File dest = new File("/Users/raymonddu/Desktop/");
        unZip(src,dest);
    }


    public static void unZip(File src, File dest) throws IOException {
        //解压缩流
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //首先获取压缩包的每一个zipEntry对象
//        for(int i=0;i<100;i++){
//            ZipEntry entry = zip.getNextEntry();
//            System.out.println(entry);
//        }

        ZipEntry entry;
        while((entry = zip.getNextEntry())!=null){
            System.out.println(entry);

            //folder - dest create a same folder
            //file - read files from zip, follow the path save to dest

            if(entry.isDirectory()){
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }
            else{
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b = zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }

        zip.close();
    }
}
