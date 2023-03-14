package Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//ORM
public class ReflectionDemo11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> c1 = Class.forName("Reflection.Student2");

        //get annotation through reflection
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //get value of the annotation
        TableK tablek = (TableK)c1.getAnnotation(TableK.class);
        System.out.println(tablek.value());

        //get certain annotation
        Field name = c1.getDeclaredField("name");
        FieldK annotation = name.getAnnotation(FieldK.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }
}

@TableK("db_student")
class Student2{
    @FieldK(columnName = "db_id", type = "int", length = 10 )
    private int id;

    @FieldK(columnName = "db_age", type = "int", length = 10)
    private int age;

    @FieldK(columnName = "db_name",type = "varchar",length = 255)
    private String name;

    public Student2(){

    }

    public Student2(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//annotation of class
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableK{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldK{
    String columnName();
    String type();
    int length();
}