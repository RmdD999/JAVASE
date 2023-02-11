package ThreadDemo;

//simulating network latency -> zoom out possibility of problems
public class SleepDemo01 implements Runnable{
    private int ticketNums = 0;


    @Override
    public void run() {
        while(true){
            if(ticketNums<=0){
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()+"-->get "+ticketNums--);
        }
    }

    public static void main(String[] args) {
        SleepDemo01 sd = new SleepDemo01();

        new Thread(sd,"ming").start();
        new Thread(sd,"tian").start();
        new Thread(sd,"guan").start();
    }
}
