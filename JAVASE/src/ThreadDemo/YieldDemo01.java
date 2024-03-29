package ThreadDemo;

//depends on CPU
public class YieldDemo01 {
    public static void main(String[] args) {
        MyYield my = new MyYield();

        new Thread(my,"a").start();
        new Thread(my,"b").start();
    }
}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Process start!");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"Process end!");
    }
}
