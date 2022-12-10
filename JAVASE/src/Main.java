public class Main {
    public static void main(String[] args) {

        //类的三大特征--封装 继承 多态
        //封装--把抽象出来的方法以及属性都包裹起来，数据通过类的包裹在内部被保护起来。 类似电视机按钮。

    }
}

class Clerk{

    public String name;
    private int age;
    private float salary;

    public Clerk(String name, int age, float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    //访问被private访问控制符修饰的成员变量
    protected int getAge(){
        return age;
    }

    protected float getSalary(){
        return salary;
    }
}

//父类变量向子类转换必须通过显示强制转换类型
//多态中向上可以自动转换。处理向下转换时建议使用instanceof来判断。