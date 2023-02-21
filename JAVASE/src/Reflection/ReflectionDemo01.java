package Reflection;

//Reflection
public class ReflectionDemo01 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //Reflection get Class of a entity
        Class c1 = Class.forName("Reflection.User");

        Class c2 = Class.forName("Reflection.User");
        Class c3 = Class.forName("Reflection.User");

        //class in memory only has one Class object
        //the constructor will be encapsulated in Class object.
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}

//entity
class User{
    private String name;
    private int id;
    private int age;

    public User(){

    }

    public User(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
