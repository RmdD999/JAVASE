package ThreadDemo;

//inherited from class Thread
public class ThreadDemo01 extends Thread{
    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("I'm reading code"+i);
        }
    }

    public static void main(String[] args) {
        //create a thread obj and start
        ThreadDemo01 thread1 = new ThreadDemo01();
        thread1.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("I'm reading code main" + i);
        }
    }
}
