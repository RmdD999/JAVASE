package Leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        List<Integer> middleNodes = getMiddleNodes(arr);
        System.out.println(middleNodes);
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

    //876. Middle of the Linked List
    //Given the head of a singly linked list, return the middle
    //node of the linked list
    //if there are two middle nodes, return the second middle node
    public static List<Integer> getMiddleNodes(int[] intArray) {
        //1.get length of the array
        int middleNode = 0;
        List<Integer> res = new ArrayList<>();
        middleNode = intArray.length / 2;
        for (int i = middleNode; i < intArray.length; i++) {
            res.add(intArray[i]);
        }

        return res;

    }

    public static boolean canConstruct(String ransomNote, String magazine){
        for(int i = 0; i <= ransomNote.length(); i++){
            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);

            if(matchingIndex == -1){
                return false;
            }

            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex+1);
        }

        return true;
    }

    //Hashmap Approach
    public static boolean canConstruct2(String ransomNote, String magazine){
        HashMap<Character,Integer> magazineLetters = new HashMap<>();

        for(int i = 0; i <= magazine.length(); i++){
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m,0);
            magazineLetters.put(m, currentCount+1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r,0);

            if(currentCount == 0) {
                return false;
            }

            magazineLetters.put(r, currentCount-1);
        }

        return true;
    }

}
