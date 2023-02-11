package ThreadDemo;

public class LambdaDemo02 {

    static class Love2 implements ILove{
        @Override
        public void love(int a) {
            System.out.println("I love you" + a);
        }
    }

    public static void main(String[] args) {
        ILove l = new ILove() {
            @Override
            public void love(int a) {
                System.out.println("I love you"+a);
            }
        };
        l.love(2);

        ILove l2 = (int a)->{
            System.out.println("I love you"+a*a);
        };
        l2.love(3);

        ILove l3 = (a)->{
            System.out.println("I love you"+a);
        };
        l3.love(90);

        ILove l4 = a->{
            System.out.println("I love you"+a);
        };
        l4.love(223);

        ILove l5 = a->System.out.println("I love you"+a);
        l5.love(9320);


        //multi paras could also not be declared type
    }
}

interface ILove{
    void love(int a);
}

class Love implements ILove{

    @Override
    public void love(int a) {
        System.out.println("I love you" + a);
    }
}
