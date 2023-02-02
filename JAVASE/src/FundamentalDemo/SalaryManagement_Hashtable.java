package FundamentalDemo;

import java.util.*;
public class SalaryManagement_Hashtable{
    public static void main(String[] args){
        Hashtable salary = new Hashtable();

        //add elements to hashtable
        salary.put("Tom",200);
        salary.put("Tim",500);
        salary.put("Lusan",8000);
        salary.put("Raymond",15000);

        //Show all salary in hash table
        Enumeration names=salary.keys();
        while(names.hasMoreElements()){
            String str = (String)names.nextElement();
            System.out.println(str+": "+salary.get(str));
        }

        //rise 1000 to Lusan's salary
        int sal = (int)salary.get("Lusan");
        salary.put("Lusan",sal+1000);
        System.out.println("Lusan's new salary is: "+salary.get("Lusan"));

        salary.remove("Tom");



    }
}
