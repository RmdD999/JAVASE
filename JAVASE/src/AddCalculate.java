public class AddCalculate {

    //all programs we are using with computer are going to be loaded to memory and then could be excuted,so if we want to
//make calculation through computer we must transfer them to math models and loaded to memeory then CPU will do the
// calculation for us.
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = a+ b;
        System.out.println("result is :" + result);
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

    //
}
