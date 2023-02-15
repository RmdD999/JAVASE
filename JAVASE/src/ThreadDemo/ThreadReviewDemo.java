package ThreadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadReviewDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new MyThread1().start();

        new Thread(new MyThread2()).start();

        FutureTask<Integer> ft = new FutureTask<Integer>(new MyThread3());
        new Thread(ft).start();

        Integer integer = ft.get();
        System.out.println(integer);

    }
}

//inherit Thread
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("I'm inherited from Thread");
    }
}

//implement Runnable interface
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I implement Runnable");
    }
}

//Callable interface
class MyThread3 implements Callable<Integer>{
    public Integer call(){
        System.out.println("I implement Callable");
        return 100;
    }
}
