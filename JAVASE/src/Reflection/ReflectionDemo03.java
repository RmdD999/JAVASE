package Reflection;

//Class creations
public class ReflectionDemo03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Student();
        System.out.println("this is a "+p.name);

        //entity
        Class<? extends Person> c1 = p.getClass();
        System.out.println(c1.hashCode());
        //forName
        Class<?> c2 = Class.forName("Reflection.Student");
        System.out.println(c2.hashCode());
        //Class.ClassName
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
        //Type
        Class<Integer> type = Integer.TYPE;
        System.out.println(type.hashCode());

        //parent class
        Class<?> c5 = c1.getSuperclass();
        System.out.println(c5);

    }
}

class Person{
    public String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "Student";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "Teacher";
    }
}
