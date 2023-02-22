package Reflection;

import java.lang.annotation.ElementType;

//all class
public class ReflectionDemo04 {
    public static void main(String[] args) {
        Class<Object> c1 = Object.class; //class
        Class<Comparable> c2 = Comparable.class;//interface
        Class<String[]> c3 = String[].class;//Array
        Class<int[][]> c4 = int[][].class;//two dimension array
        Class<Override> c5 = Override.class;//notes
        Class<ElementType> c6 = ElementType.class;//enum
        Class<Long> c7 = long.class;//primitive type
        Class<Void> c8 = void.class;//key word
        Class<Class> c9 = Class.class;//Class


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }
}
