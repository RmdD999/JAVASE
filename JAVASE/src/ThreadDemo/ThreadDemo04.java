package ThreadDemo;

public class ThreadDemo04 implements Runnable{
    private int ticket = 10;

    @Override
    public void run() {
        while(true){
            if(ticket <= 0){
                break;
            }
            else{
                System.out.println(Thread.currentThread().getName()+"get ticket number: " + ticket--);
            }
            //simulating delay
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo04 ticket = new ThreadDemo04();

        new Thread(ticket,"Bob").start();
        new Thread(ticket,"lili").start();
        new Thread(ticket,"Ada").start();
    }
}
