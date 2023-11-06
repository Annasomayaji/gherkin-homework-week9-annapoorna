package resources;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_IsArrayEmpty {
    public static void main(String[] args) {

        //declare scanner object
        Scanner scanner = new Scanner(System.in);

        //In console enter null 4 times to create an empty array list
        System.out.println("Enter nulls or 4 integer values:");
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 4; i++) {
            list.add(scanner.next());
        }

        // call static method
        isArrayEmptyOrNot(list);

        //Close scanner object
        scanner.close();
    }

    public static void isArrayEmptyOrNot(ArrayList<Object> list) {
        boolean isEmpty = true;
        for (Object value : list) {
            if (!value.equals("null")) {
                isEmpty = false;
                break;
            }
        }
        if (isEmpty) {
            System.out.println("The array list is empty.");
        } else {
            System.out.println("The array list contains elements.");
        }
    }

}
