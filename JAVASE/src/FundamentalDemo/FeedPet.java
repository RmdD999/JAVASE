package FundamentalDemo;

public class FeedPet {

    public static void main(String[] args){

    }
}

class Owner{
    public void feed(Animal ani, Food food){

    }
}

class Food{

    public void showInfo(){

    }

}

class Bones extends Food{
    public void showInfo(){
        System.out.println("bones");
    }
}

class Fish extends Food{
    public void showInfo(){
        System.out.println("fish");
    }
}

class Animal2{
    public void showInfo(){

    }
}

class Dog2 extends Animal2{
    public void showInfo(){
        System.out.println("I'm a dog, I like bones.");
    }
}

class Cat2 extends Animal2{
    public void showInfo(){
        System.out.println("I'm a cat, I like fish.");
    }
}
