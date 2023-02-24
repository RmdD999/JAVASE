package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//dynamic create obj through reflection
public class ReflectionDemo09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> c1 = Class.forName("Reflection.User");

        //construct a obj
//        User o = (User)c1.newInstance();
//        System.out.println(o);

//        Constructor<?> declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
//        User tom = (User)declaredConstructor.newInstance("Tom", 1, 18);
//        System.out.println(tom);

        User user = (User)c1.newInstance();
//        Method setName = c1.getDeclaredMethod("setName", String.class);
//        setName.invoke(o,"Ra");
//        System.out.println(o);

        Field name = c1.getDeclaredField("name") ;
        name.setAccessible(true);
        name.set(user,"sls");
        System.out.println(user.getName());
    }
}
