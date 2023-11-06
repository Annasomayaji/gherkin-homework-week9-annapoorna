package resources;

import java.util.ArrayList;

/**
 *  Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_ArrayListComparison {
    public static void main(String[] args) {

        //Declare 2 ArrayLists
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Call method to compare and print result
        compareTwoArrayLists(c1, c2);
    }

    //Method to compare if 2 array lists are same and print result
    public static void compareTwoArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        if (list1.equals(list2)) {
            System.out.println("The arrays lists have same elements");
        } else {
            System.out.println("The arrays do not contain same elements");
        }

    }
}

