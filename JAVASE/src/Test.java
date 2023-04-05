import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] res = FizzBuzz(15);
        System.out.println(Arrays.toString(res));

        List<String> res2= FizzBuzz2(15);
        System.out.println(res2);
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

    public static List<String> FizzBuzz2(int number){
        List<String> res = new ArrayList<>();

        for(int i = 1; i <= number; i++){
            boolean dividedBy3 = i%3==0;
            boolean dividedBy5 = i%5==0;

            String currStr = "";
            if (dividedBy3) {
                currStr+="Fizz";
            }
            if (dividedBy5) {
                currStr+="Buzz";
            }
            if(currStr.isEmpty()){
                currStr = String.valueOf(i);
            }

            res.add(currStr);
        }
        return res;
    }
}
