package resources;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_IsArrayEmpty_2 {
    public static void main(String[] args) {

        //Declare an empty array List
        ArrayList<Object> list1 = new ArrayList<Object>();

        //Declare another array and add elements
        ArrayList<Object> list2 = new ArrayList<Object>();
        for (int i = 0; i < 3; i++) {
            list2.add(i);
        }

        //declare object to call instance method
        Programme_7_IsArrayEmpty_2 obj = new Programme_7_IsArrayEmpty_2();

        //Print out result of isEmptyArray method
        System.out.println("ArrayList List1 is "+obj.isArrayListEmpty(list1));
        System.out.println("ArrayList List2 is "+obj.isArrayListEmpty(list2));

    }

    //Method to check if the array lest is empty or not
    public String isArrayListEmpty(ArrayList<Object> list) {

        if(list.isEmpty())
        {
          return "empty";
        }
        else {
            return "not empty";
        }

    }
}
