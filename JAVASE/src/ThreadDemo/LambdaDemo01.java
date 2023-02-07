package ThreadDemo;

public class LambdaDemo01 {

    //static internal class
    static class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("I like lambda 2");
        }
    }

    public static void main(String[] args) {
        ILike l = new Like();
        l.lambda();

        Like2 l2 = new Like2();
        l2.lambda();

        //scope internal class
        class Like3 implements ILike{

            @Override
            public void lambda() {
                System.out.println("I like lambda 3");
            }
        }


        l = new Like3();
        l.lambda();


        //anonymous inner class -> no name, need to declare with interface or father class
        l = new ILike(){

            @Override
            public void lambda() {
                System.out.println("I like lambda 4");
            }
        };
        l.lambda();

        //lambda
        l = ()->{System.out.println("I like lambda 5");};
        l.lambda();
    }
}

//define a functional interface
interface ILike{
    void lambda();
}

class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("I like lambda");

    }
}


