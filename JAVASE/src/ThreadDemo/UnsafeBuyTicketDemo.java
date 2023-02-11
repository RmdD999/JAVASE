package ThreadDemo;

public class UnsafeBuyTicketDemo {
    public static void main(String[] args) {
        BuyTicket bt = new BuyTicket();

        new Thread(bt,"Tom").start();
        new Thread(bt,"Chino").start();
        new Thread(bt,"Backer").start();
    }



}

class BuyTicket implements Runnable{
    int ticketNums = 10;
    boolean flag = true;

    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void buy() throws InterruptedException {
        if(ticketNums<=0){
            flag = false;
            return;
        }
        else{
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+" get "+ticketNums--);
        }
    }
}