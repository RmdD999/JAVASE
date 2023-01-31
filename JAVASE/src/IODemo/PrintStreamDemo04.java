package IODemo;

import java.io.PrintStream;

public class PrintStreamDemo04 {
    public static void main(String[] args) {
        /*
        print stream using scenarios
         */

        //获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        //特殊的打印流，系统中的标准输出流
        PrintStream out = System.out;
        out.println("nis");

    }
}
