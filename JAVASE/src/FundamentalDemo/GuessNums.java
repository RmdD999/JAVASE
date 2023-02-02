package FundamentalDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessNums {

    public static void guessNum() {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        while (true) {
            System.out.println("Guess a number from 0 to 10.");

            try{
                if(Integer.parseInt(bf.readLine()) == (int)(Math.random()*10)){
                    System.out.println("you are right.");
                    break;
                }
                else{
                    System.out.println("You are wrong, guess again.");
                }
            }
            catch(Exception e) {
                System.out.println("Please type correct pattern of input.");
            }
        }
    }

}
