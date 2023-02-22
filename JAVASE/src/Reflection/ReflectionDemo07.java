package Reflection;

//
public class ReflectionDemo07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //get System class loader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //get parent class loader ->extension loader
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //get extension class loader's parent class --> root loader
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        ClassLoader classLoader = Class.forName("Reflection.ReflectionDemo07").getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        System.out.println(System.getProperty("java.class.path"));

        /*
        /Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/lib/commons-io-2.11.0.jar:
        /Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/lib/hutool-all-5.8.11.jar
         */

        
    }

}
