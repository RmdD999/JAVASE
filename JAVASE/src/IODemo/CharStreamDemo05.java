package IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo05 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("a.txt",true);

        fr.write("你好呀。");
        fr.write("你好呀。");
        fr.write("你好呀。");
        fr.write("你好呀。");
        fr.write("你好呀。");

        //refresh -- then could write other content to files.
        
        fr.flush(); //提前将缓冲区中的数据加载到文件中

        fr.write("我是Raymond");
        for (int i = 0; i < 8192; i++) {

        }

        fr.close();
    }
}
