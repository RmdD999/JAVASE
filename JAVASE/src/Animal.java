//抽象类不可被实例化
//抽象类可以被继承
//继承抽象类的子类，必须实现所有父类的抽象方法。
//抽象类中可以没有抽象方法
//含有抽象方法的类一定要命名为抽象类
//When to use abstract class -- 当继承父类有很多子类都实现同一类型但是不同的方法时。
abstract public class Animal {
    int age;
    String name;

    abstract public void speak();

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
