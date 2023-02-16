package Annotation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

//Annotation
public class AnnotationTestDemo01 extends Object{
    public static void main(String[] args) {
        test();
    }

    //Override
    @Override
    public String toString() {
        return "oo";
    }

    //not recommend coders to use
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList<>();
    }
}
