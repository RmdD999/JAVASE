package ThreadDemo;

//producer and consumer
public class PCDemo {
    public static void main(String[] args) {
        SynContainer sc = new SynContainer();
        new Productor(sc).start();
        new Consumer(sc).start();
    }
}

//producer
class Productor extends Thread{
    SynContainer sc;
    public Productor(SynContainer sc){
        this.sc =sc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Produced "+i+" chicken.");
            try {
                sc.push(new Chicken(i));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//consumer
class Consumer extends Thread{
    SynContainer sc;
    public Consumer(SynContainer sc){
        this.sc =sc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Consume "+sc.pop().id+"chicken");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Chicken{
    int id;

    public Chicken(int id){
        this.id = id;
    }
}

class SynContainer{
    Chicken[] chickens = new Chicken[10];
    int count = 0;

    //Productor add chicken
    public synchronized void push(Chicken c) throws InterruptedException {
        //if full->need to wait consumers to consume then add new chicken
        if(count==chickens.length){
            this.wait();
        }
        chickens[count] = c;
        count++;
    }
    //consumers consume chicken
    public synchronized Chicken pop() throws InterruptedException {
        if(count==0){
            this.wait();
        }

        count--;
        Chicken chicken = chickens[count];
        this.notifyAll();
        //notice productor
        return chicken;
    }
}