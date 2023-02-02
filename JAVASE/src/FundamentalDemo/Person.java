package FundamentalDemo;

public class Person {

    String name;
    int weight;
    float height;

    public Person(int weight, String name){
        this.weight = weight;
        this.name = name;
    }

    public void speak(){
        System.out.println("I'm a good man.");
    }
}
