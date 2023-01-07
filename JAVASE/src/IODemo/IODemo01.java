package IODemo;

import java.io.*;
import java.nio.file.Files;

public class IODemo01 {
    public static void main(String[] args) throws IOException {
        //copy a dir with sub dirs.

        File file = new File("/Users/raymonddu/Desktop/books");
        File dest = new File("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/");

        copyDir(file,dest);
    }


    private static void copyDir(File source, File dest) throws IOException {
        //如果不存在直接创建文件夹
        dest.mkdirs();
        File[] files = source.listFiles();

        if(files==null) return;
        
        //1 -递归
        for (File file : files) {
            //判断 文件直接copy dir继续递归
            //文件开始 文件结束
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));

                byte[] bytes = new byte[1024*1024*5];
                int len;
                while((len = fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }

                fos.close();
                fis.close();
            }
            else{
                copyDir(file,new File(dest,file.getName()));
            }
        }

    }
}
