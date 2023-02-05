package ThreadDemo;

public class Race implements Runnable{
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            //whether there is a winner
            boolean flag =gameOver(i);
            if(flag==true){
                break;
            }

            //simulating rabbit got a nap
            if(Thread.currentThread().getName().equals("Rabbit")&& i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName()+"--> ran for "+i +"steps");
        }
    }

    private boolean gameOver(int steps){
        if(winner != null){
            return true;
        }{
            if(steps>=100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is :"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race,"Rabbit").start();
        new Thread(race,"Turtle").start();
    }
}
