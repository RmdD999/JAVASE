package IODemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {
        //什么是IO流？
        //存储和读取的解决方案 input output

        //IO流的作用？
        //读写数据

        //IO流按照流向分可以分成什么？
        //输出流--》文件 输入流--》读取
        //Reader Writer

        //IO流按照文件类型来分可以分成什么？
        //字节流--》all type  字符流--》可以被记事本打开并不影响其内容的文件 txt md,xml lrc.
        //InputStream OutputStream

        //Create new object
        //if the file already existed, then will erase all the content inside.
        FileOutputStream fos = new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/a.txt");
//        FileOutputStream fos = new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/a.txt");
//        File f = new File(".\\JAVASE\\src\\IODemo\\a.txt");
//        if(f.exists()&&!f.isDirectory()){
//            System.out.println(f.getPath());
//        }
        //Output to a file integer -- ASCII
        fos.write(97);
        //release resources
        fos.close();
    }
}
