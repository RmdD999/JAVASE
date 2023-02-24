package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Class Info
public class ReflectionDemo08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> c1 = Class.forName("Reflection.User");
        User u = new User();
        c1 = u.getClass();


        //name
        System.out.println(c1.getName()); //package + name
        System.out.println(c1.getSimpleName());// name

        //properties
        Field[] fields = c1.getFields(); //public
//        for(Field f:fields){
//            System.out.println(f);
//        }

        Field[] declaredFields = c1.getDeclaredFields(); // all
        for(Field df : declaredFields){
            System.out.println(df);
        }

        //get certain field
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //get methods
        Method[] methods = c1.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("==================");
        methods = c1.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }

        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //get constructor
        Constructor<?>[] constructors = c1.getConstructors();
        Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();

        for(Constructor c : constructors){
            System.out.println(c);
        }

        for(Constructor dc : declaredConstructors){
            System.out.println(dc);
        }

        Constructor<?> declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);

    }
}
