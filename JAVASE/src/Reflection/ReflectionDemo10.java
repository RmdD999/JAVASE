package Reflection;

public class ReflectionDemo10 {

    public static void main(String[] args) {
        test01();
    }
    //普通方式调用
    public static void test01(){
        User u = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            u.getName();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("normal ways excute 1000000000:" + (endTime - startTime)+"ms");
    }
    //反射方式调用

    //反射方式调用 关闭检测
}
