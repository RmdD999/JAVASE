package ThreadDemo;

public class DeamonDemo01 {
    public static void main(String[] args) {
        God god = new God();
        People ppl = new People();

        Thread thread = new Thread(god);
        thread.setDaemon(true); //default is false user process
        thread.start();

        Thread thread1 = new Thread(ppl);
        thread1.start();

    }



}

class People implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 365000; i++) {
            System.out.println("happy days ");
        }
        System.out.println("-===Goodbye world!===-");
    }
}

class God implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("God bless you!");
        }
    }
}