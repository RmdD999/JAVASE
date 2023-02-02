package FundamentalDemo;

public class Pupil {

    private int age;
    private String name;
    private float fee;

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

    public float getFee(){
        return fee;
    }

    public void setFee(float fee){
        this.fee = fee;
    }
}

//父类 public protected类可以被继承，但是private属性以及方法不可以。
//子类只能继承一个父类，Java中可以使用interface来弥补，当然也可以使用多重继承
//所有类都是Object的子类

//方法的覆盖 overwrite 只存在与父类以及子类之间

