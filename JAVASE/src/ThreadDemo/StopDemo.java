package ThreadDemo;

//stop testing
//1. process stop automatically, dead loop not recommended.
//2. deprecated functions not recommended.
public class StopDemo implements Runnable{

    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while(flag){
            System.out.println("run.....Thread"+i);
        }
    }

    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        StopDemo sd = new StopDemo();
        new Thread(sd).start();

        for(int i = 0;i<1000;i++){
            System.out.println("main "+ i);
            if(i==900){
                sd.stop();
                System.out.println("Process stoped");
            }
        }
    }
}
