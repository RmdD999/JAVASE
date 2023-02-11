package ThreadDemo;

//monitoring the state of Thread
public class StateDemo01 {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(()->{
            for(int i=0;i<5;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("////////");
            }
        });

        //state
        Thread.State state = th.getState();
        System.out.println(state); //new

        //start
        th.start();
        state = th.getState();
        System.out.println(state);//Run

        while(state!= Thread.State.TERMINATED){
            Thread.sleep(100);
            state = th.getState(); //update state
            System.out.println(state);
        }
    }
}
