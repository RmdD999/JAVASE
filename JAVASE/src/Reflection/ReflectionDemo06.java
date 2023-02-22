package Reflection;

//when class will be init
public class ReflectionDemo06 {
    static {
        System.out.println("Main() loaded.");
    }
    public static void main(String[] args) throws ClassNotFoundException {
//        Son son = new Son();
//
//        //Reflection
//        Class<?> c1 = Class.forName("Reflection.Son");

        //not generate classes' reference
//        System.out.println(Son.b);

        Son[] arr = new Son[10];

        System.out.println(Son.M);

    }
}

class Father{
    static int b = 2;
    static{
        System.out.println("Father loaded.");
    }
}

class Son extends Father{
    static {
        System.out.println("Son loaded");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}
