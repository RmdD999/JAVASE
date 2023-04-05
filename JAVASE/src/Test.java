import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] res = FizzBuzz(15);
        System.out.println(Arrays.toString(res));
    }

    public static String[] FizzBuzz(int number){
        String[] result = new String[number];

        for(int i = 0; i < number; i++){
            if ((i+1)%3==0&&((i+1)%5)==0) {
                result[i] = "FizzBuzz";
            }
            else if((i+1)%3==0){
                result[i] = "Fizz";
            } else if ((i+1)%5==0) {
                result[i] = "Buzz";
            }
            else{
                result[i] = Integer.toString(i+1);
            }
        }
        return result;
    }
}
