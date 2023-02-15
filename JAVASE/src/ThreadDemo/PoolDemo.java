package ThreadDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class PoolDemo {
    public static void main(String[] args) {
        //1. create service Thread pool
        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(new MyThread());
        es.execute(new MyThread());
        es.execute(new MyThread());
        es.execute(new MyThread());

        //close
        es.shutdown();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}