package ThreadDemo;

//multiple thread have the resource that others need
public class DeadLockDemo {
    public static void main(String[] args) {
        Makeup girl1 = new Makeup(0,"Susan");
        Makeup girl2 = new Makeup(1,"Tina");

        girl1.start();
        girl2.start();
    }
}

class LipStick{

}

class Mirror{

}

class Makeup extends Thread{
    static LipStick lipStick = new LipStick();
    static Mirror mirror = new Mirror();

    int choice;
    String girlName;

    Makeup(int choice, String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }
    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //互相持有对方的锁
    private void makeup() throws InterruptedException {
        if(choice==0){
            synchronized(lipStick){
                System.out.println(this.girlName+"get the lipstick's lock");
                Thread.sleep(1000);
            }
            synchronized (mirror){
                System.out.println(this.girlName+"get the mirror's lock");
            }
        }
        else{
            synchronized(mirror){
                System.out.println(this.girlName+"get the mirror's lock");
                Thread.sleep(2000);
            }
            synchronized (lipStick){
                System.out.println(this.girlName+"get the lipstick's lock");
            }
        }
    }
}
