package ThreadDemo;

import java.util.concurrent.locks.ReentrantLock;

public class LockExe {
    public static void main(String[] args) {
        Cake c = new Cake();
        Cake c2 = new Cake();
        new Thread(c,"Tom").start();
        new Thread(c2,"Raymond").start();
        new Thread(c,"Lusan").start();
        new Thread(c,"Mom").start();
    }
}

class Cake implements Runnable{
    int CakeNums = 20; // 20 left

    private final ReentrantLock rtLock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try{
                rtLock.lock();
                if(CakeNums>0){
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+CakeNums--);
                }
                else{
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                rtLock.unlock();
            }
        }
    }
}
