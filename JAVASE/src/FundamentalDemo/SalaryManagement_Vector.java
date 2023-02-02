package FundamentalDemo;

import java.util.*;
public class SalaryManagement_Vector {
    public static void main(String[] args){
        Vector<ClerkSalary> vec = new Vector<ClerkSalary>();

        //Adding elements using add() method of list
        vec.add(new ClerkSalary("Tom",2000));
        vec.add(new ClerkSalary("Tim",1000));

        //Adding elements using addElement() method of vector
        vec.addElement(new ClerkSalary("Lusan",8000));
        vec.addElement(new ClerkSalary("Raymond",12000));

        System.out.println("size is: "+vec.size());
        System.out.println(("capacity is: "+vec.capacity()));
        System.out.println("Elements are "+vec);

        //checking whether a element is included by the vec
        if(vec.contains(new ClerkSalary("Tomson",200))){
            System.out.println("Yes");
        }
        else{
            System.out.println("This element is not in the vec");
        }

        //Get first element
        System.out.println(vec.firstElement());
        //Get last element
        System.out.println(vec.lastElement());

        //Remove a element
        vec.remove(1);
        System.out.println(vec);

        //Get the hashcode
        System.out.println("Hash code of this vector: "+vec.hashCode());

        //Get the element at specified index
        System.out.println("Element at index 2 is: "+vec.get(2));
    }
}

