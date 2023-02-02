package CommonIODemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonIODemo01 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/CommonIODemo/a.txt");
        File dest = new File("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/CommonIODemo/aCopy.txt");
        FileUtils.copyFile(src,dest);

        FileUtils.copyDirectory(new File("/Users/raymonddu/Desktop/沐沐证件"),
                new File("/Users/raymonddu/Desktop/momo"));

//        FileUtils.copyDirectoryToDirectory(new File("/Users/raymonddu/Desktop/沐沐证件"),
//                new File("/Users/raymonddu/Desktop/momoDir"));

        FileUtils.deleteDirectory(new File("/Users/raymonddu/Desktop/momoDir"));

        FileUtils.cleanDirectory(new File("/Users/raymonddu/Desktop/momo"));
    }
}
