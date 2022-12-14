import java.util.*;
public class SalaryManagement_ArrayList {
    public static void main(String[] args){
        ArrayList<ClerkSalary> clkSal = new ArrayList<ClerkSalary>();

        clkSal.add(new ClerkSalary("Lusan",8200));
        clkSal.add(new ClerkSalary("Tom",3000));
        clkSal.add(new ClerkSalary("Raymond",250000));
        clkSal.add(new ClerkSalary("Tim",3200));

        System.out.println(clkSal.get(1));

        //change an item
        clkSal.set(0,new ClerkSalary("Lusan",9000));
        System.out.println(clkSal.get(0));

        //remove an item
        clkSal.remove(3);

        //size
        System.out.println(clkSal.size());

        //foreach
        for(ClerkSalary cl:clkSal){
            System.out.println(cl);
        }

        
    }
}
