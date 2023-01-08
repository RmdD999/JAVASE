package IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IODemo03 {
    public static void main(String[] args) throws IOException {
        //reverse numbers from a file

        //Create Stream
        FileInputStream fis = new FileInputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/a.txt");
        FileOutputStream fos = new FileOutputStream("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/IODemo/copy.txt");

        //read data
        int len;
        byte[] bytes = fis.readAllBytes();
        char[] nums = new char[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            char temp = (char)bytes[i];
            nums[i] = temp;
        }

        //reverse data using 冒泡函数
        for (int i = 0; i < nums.length-1; i++) {
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    char temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        //write into new file
        for (int num : nums) {
            fos.write((byte)num);
        }

        //release
        fos.close();
        fis.close();
    }
}
