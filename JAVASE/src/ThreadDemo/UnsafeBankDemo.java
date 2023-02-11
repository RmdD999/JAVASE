package ThreadDemo;

public class UnsafeBankDemo {
    public static void main(String[] args) {
        Account acc = new Account(100,"Deposit");
        WithDraw you = new WithDraw(acc,50,"Tom");
        WithDraw wife = new WithDraw(acc,500,"Tom's wife");

        you.run();
        wife.run();
    }
}

class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class Bank{

}

class WithDraw extends Thread{
    Account account;
    int drawingMoney;
    int cash;

    public WithDraw(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        synchronized(account){
            if(account.money - drawingMoney<0){
                System.out.println("not enough.");
                return;
            }
            else{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                account.money -= drawingMoney;
                cash += drawingMoney;
                System.out.println(account.name + "now have " +account.money +"in the back account.");
                System.out.println(this.getName()+"cash now have"  + cash);
            }
        }

    }
}
