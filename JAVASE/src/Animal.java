public class Animal {
    int age;
    String name;

    public void speak(){
        System.out.println("I'm a animal, I don't know how to bark.");
    }

    public static void main(String[] args){

        //多态
        //当我们定义一个父类对象的时候，new的是子类 -- 系统会自动将子类的对象赋值给左边父类对象
        Animal c = new Cat();
        c.speak();

        Animal d = new Dog();
        d.speak();
    }
}

class Cat extends Animal{

    public void speak(){
        System.out.println("meow!");
    }
}

class Dog extends Animal{

    //通过super()可以直接调用父类的构造函数
    public void speak(){
        System.out.println("wolf!");
    }
}
