package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationDemo02 {
    @MyAnnotation2(name = "Raymond",schools = {"AUT","MIT"})
    public void test(){

    }

    @MyAnnotation3("Robby")
    public void test2(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String name() default ""; //paras type+name+()
    int age() default 0;
    int id() default -1;//-1 means not exist. indexof -> -1

    String[] schools() default {"MIT"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}
