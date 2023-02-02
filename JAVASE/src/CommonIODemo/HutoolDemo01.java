package CommonIODemo;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class HutoolDemo01 {
    public static void main(String[] args) {
        File file = FileUtil.file("src","CommonIODemo","aaa", "bbb", "a.txt");
        System.out.println(file);
    }
}
