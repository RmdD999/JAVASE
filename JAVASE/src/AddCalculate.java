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
//        swapTwoNums3();
//        switchCase();
//        forLoop();
//        GuessNums.guessNum();
//        primeNumber();
//        fibonacci();
//        rectangle();
//        triganle();
//        equilateralTranigle();
//        diamond();

//        Person per = new Person(30,"Tom");
//        System.out.println("name: "+per.name+"weight: "+per.weight);

        Child ch1 = new Child("Tom",20);
        ch1.showInfo();
        Child ch2 = new Child("Tom",20);
        ch2.showInfo();
        Child ch3 = new Child("Tom",20);
        ch3.showInfo();
        Child ch4 = new Child("Tom",20);
        ch4.showInfo();

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

    //switch case
    //default 的位置与结果无关， 缺少break的语句会发生case穿透--忽视下方的case判定的存在， 直接执行case后面的代码块
    public static void switchCase(){

        int a =10, b = 20;
        System.out.println(a>b?a:b);

        switch(a){
            default :System.out.println("default");break;
            case 10 : System.out.println("10");
            case 5 : System.out.println("5");
            case 6 : System.out.println("6"); break;
            case 7 : System.out.println("7"); break;
            case 20 : System.out.println("20"); break;
        }
    }

    //for loop
    // advice on using for loop: 1. recorder start from 0 or 1. 2.
    public static void forLoop(){
        for(int i =0; i < 7; i++) {
            System.out.println("Hello World.");
        }
    }

    //find out all prime numbers from 1-100
    public static void primeNumber() {

        for(int i = 1; i < 100; i++) {

            int j = 2;
            while(j <= i){
                if(i%j == 0){
                    break;
                }
                j++;
            }

            if(j==i) {
                System.out.println(i);
            }
        }
    }

    //fibonacci sequence
    public static void fibonacci(){

        long sum = 0;
        long front = 0;
        long back = 1;

        for(int k = 1; k < 50; k++) {
            if(k==1)
                System.out.println(k);
            sum = front + back;
            System.out.println(sum);
            front = back;
            back = sum;
        }
    }

    //6行10列的矩形
    public static void rectangle(){

        for(int i =1;i<=6;i++) {

            for(int k = 1; k<=10; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //七层直角三角形
    public static void triganle() {

        for(int i =1; i<=6; i++){

            for(int row =1; row<=i; row++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //打印一个七层的等边三角形
    public static void equilateralTranigle(){

        for(int i = 1; i <= 7; i++) {

            //need some space here
            for(int space = 1; space <= 7-i;space++ ){
                System.out.print(" ");
            }

            for(int k = 1; k <= i*2-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // print a diamond
    public static void diamond(){
        //total lines 15
        int totalRows = 15;

        int midRow = 0;
        for(int row =1; row<=totalRows; row++){

            if(row <= (totalRows+1)/2){
                midRow = row;
            }
            else{
                midRow = totalRows-row+1;
            }

            for(int space=0; space<(totalRows+1)/2-midRow; space++){
                System.out.print(" ");
            }

            for(int star=1;star<=2*midRow-1;star++){
                if(star==1||star==2*midRow-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    //一个Java源文件中最多只能有一个public类，当有一个public 类时，源文件名称必须与其一致，至于main()不是必须要放在public类中才能运行程序

    //方法的重载 overload --同一个类中，方法名一样，参数不同，或者参数数量不同
    //为什么要进行方法的重载：Java是强类型语言，如果没有overload，那么要定义很多不同名称的相同功能的方法。


    //构造方法：方法名与类相同，没有返回值类型，在创建一个类的新对象的时候，系统会自动调用该类的构造方法完成对新对象的初始化。
    //在一个类中可以有多个构造方法，每一个类都会有一个默认的构造方法。

    //this代词使用--不能在该类的外部使用，只能在该类定义的方法中使用。
}
