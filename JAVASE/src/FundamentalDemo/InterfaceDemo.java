package FundamentalDemo;//接口比喻 -- USB插口，USB插头标准一致但是插入的设备不一定相同，接口提供一个可以发生交换的通道。
//接口可以必做更加抽象的抽象类，接口中每一个方法都不可以实现但是体现了高内聚低耦合的程序设计思想

//接口不能被实例化
//一个类可以实现多个接口
//接口中可以有变量，但是不能用private或者protected修饰 -- 接口中的变量是static的，只能用public，static，final修饰
//开发中，时常将常用的变量定义到接口中 作为全局变量使用
//接口不能继承其他的类，但是可以继承其他的接口
public class InterfaceDemo {

    public static void main(String[] args){
        Computer cpt = new Computer();
        cpt.useUsb(new Camera());
        cpt.useUsb(new uDisk());
    }
}

interface Usb{
    int a=1;

    public void start();
    public void stop();
}

class Camera implements Usb{

    @Override
    public void start() {
        System.out.println("I'm camera, start working.");
    }

    @Override
    public void stop() {
        System.out.println("I'm camera, stop working.");
    }
}

class uDisk implements Usb{

    @Override
    public void start() {
        System.out.println("I'm FundamentalDemo.uDisk start working.");
    }

    @Override
    public void stop() {
        System.out.println("I'm FundamentalDemo.uDisk stop working.");

    }
}

class Computer{
    public void useUsb(Usb usb){
        usb.start();
        usb.stop();
    }
}
