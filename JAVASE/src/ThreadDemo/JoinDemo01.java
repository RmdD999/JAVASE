package ThreadDemo;

public class JoinDemo01 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        JoinDemo01 jd = new JoinDemo01();
        Thread th = new Thread(jd);
        th.start();

        //main Thread
        for (int i = 0; i < 1000; i++) {
            if(i==200){
                th.join();
            }
            System.out.println("main"+i);
        }
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("Process VIP is coming"+i);
        }
    }
}
