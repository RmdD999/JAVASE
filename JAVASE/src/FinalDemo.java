public class FinalDemo {
    //final可以用在变量和方法
    //不希望父类的某些方法被子类改写
    //不希望类中某个变量的值被修改
    //不希望类被继承时

    //final修饰的变量一般叫做常量 xx_xx_xx
    //final修饰变量时必须赋值，否则之后不可赋值。



}

final class Phone{
    final int a=10;

    final public void sendMsg(){
        System.out.println("sent.");
    }
}

//class Apple extends Phone{
//
//}
