package Reflection;

public class ReflectionDemo05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
        /*
        1.load to memory will generate Class obj
        2.linked finished, m = 0
        3.init <clinit>(){
            m = 300;
            m = 100;
        }

        m = 100;
         */
    }
}

class A{
    static{
        System.out.println("Class A static block init.");
        m = 300;
    }
    /*
    m = 300
    m = 100
     */
    static int  m = 100;

    public A(){
        System.out.println("Constructor without paras");
    }

}