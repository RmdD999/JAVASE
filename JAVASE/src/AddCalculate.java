public class AddCalculate {

    //all programs we are using with computer are going to be loaded to memory and then could be excuted,so if we want to
//make calculation through computer we must transfer them to math models and loaded to memeory then CPU will do the
// calculation for us.
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int result = a+ b;
//        System.out.println("result is :" + result);
//        swapTwoNums();
//        swapTwoNums2();
        swapTwoNums3();
    }

    //the place that memeory assigned to 'a' could be different
    public void Calculation2(){
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }

    //整形变量
    //byte short int long

    //浮点型变量
    //float double

    //字符型变量
    //char

    //布尔型变量
    //boolean

    //字符串形变量
    //String

    //自动转换
    // byte short char --> int
    // boolean type is not going to participate in any transformation
    // float --> double

    //在java中当我们定义一个变量后如果没有赋值会被系统赋予初始值
    //byte short int long  --> 0
    //char --> '' (empty space)
    //float double --> 0.0
    //boolean --> false
    //reference type --> null

    //wasting of memory using this swap method
    public static void swapTwoNums(){
        int a = 10;
        int b = 20;
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    //数据溢出
    public static void swapTwoNums2(){
        int a = 10;
        int b = 20;
        a += b;

        b = a- b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }

    //best solution
    public static void swapTwoNums3(){
        int a = 10;
        int b = 20;

        a = a^b;
        b = b^a;
        a = a^b;

        System.out.println(a);
        System.out.println(b);

    }
}
