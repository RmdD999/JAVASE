package ThreadDemo;

//runnable rewrite run
public class ThreadDemo03 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("I'm reading code" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo03 td3 = new ThreadDemo03();
        Thread td = new Thread(td3); //delegate
        td.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("I'm reading main" + i);
        }
    }
}
