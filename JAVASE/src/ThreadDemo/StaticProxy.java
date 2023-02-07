package ThreadDemo;

//static proxy delegate
// real obj and delegate obj need to implement the same interface

public class StaticProxy {
    public static void main(String[] args) {

        new Thread(()-> System.out.println("I love you")).start();

        new WeddingCompany(new You()).HappyMarry();

    }
}

interface Marry{

    void HappyMarry();

}

class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("Getting married, happy~~");
    }
}

//delegate
class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }
    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("gather money.");
    }

    private void before() {
        System.out.println("set up.");
    }
}
