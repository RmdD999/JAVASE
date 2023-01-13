package IODemo;

import java.io.Serializable;

public class Student implements Serializable {//标记性接口 一旦实现 表示当前类可以被序列化
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
