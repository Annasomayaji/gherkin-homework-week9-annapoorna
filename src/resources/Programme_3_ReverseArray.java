package resources;
/**
 * Write a Java program to reverse an array of integer values.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int[] numArray = new int[5];
        //declare scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numArray[i] = scanner.nextInt();
        }
        //calling the reverseArray method
        //Convert the array to string and print
        System.out.println(Arrays.toString(reverseArray(numArray)));

        //close the scanner object
        scanner.close();
    }

    //method to reverse the array
    public static int[] reverseArray(int numArray[]) {
        int temp;
        int j = numArray.length - 1;//4
        for (int i = 0; i <= j; i++) {
            temp = numArray[i];
            numArray[i] = numArray[j];
            numArray[j]=temp;
            j--;
        }

        return numArray;
    }
}
