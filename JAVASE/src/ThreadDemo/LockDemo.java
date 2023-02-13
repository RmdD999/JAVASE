package ThreadDemo;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        Lock2 l = new Lock2();
        new Thread(l).start();
        new Thread(l).start();
        new Thread(l).start();
    }
}

class Lock2 implements Runnable{
    int ticketNums = 10;

    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try{
                lock.lock();
                if(ticketNums>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(ticketNums--);
                }
                else{
                    break;
                }
            }
            finally {
                lock.unlock();
            }

        }
    }
}
