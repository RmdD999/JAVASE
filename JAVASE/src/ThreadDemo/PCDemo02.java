package ThreadDemo;

public class PCDemo02 {
    public static void main(String[] args) {
        TVShow tvShow = new TVShow();
        new Actor(tvShow).start();
        new Customer(tvShow).start();
    }
}

class Actor extends Thread{
    TVShow tvShow;
    public Actor(TVShow tvShow){
        this.tvShow = tvShow;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                try {
                    this.tvShow.play("The American voice");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                try {
                    this.tvShow.play("Ads");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


class Customer extends Thread{
    TVShow tvShow;
    public Customer(TVShow tvShow){
        this.tvShow = tvShow;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                tvShow.watch();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class TVShow{
    //Actor perform customer wait ->true
    //customer watch show Actor wait ->false
    String voice; //the show that will perform
    Boolean flag = true; //decide who will be waited to other

    public synchronized void play(String voice) throws InterruptedException {
        if(!flag){
            this.wait();
        }
        System.out.println("Actor is"+voice);
        this.notifyAll();
        this.voice = voice;
        this.flag =! this.flag;
    }

    public synchronized void watch() throws InterruptedException {
        if(flag){
            this.wait();
        }
        System.out.println("Customers watched:"+voice);
        this.notifyAll();
        this.flag = !this.flag;
    }
}