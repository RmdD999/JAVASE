package FundamentalDemo;

public class Child {

    String name;
    int age;

    static int total = 0;

    public Child(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void showInfo(){
        this.total+=1;
        System.out.println("now we have "+this.total+" children");
    }
}
