package resources;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_4_ArrayListOfColours {
    public static void main(String[] args) {
        //declare an array list
        ArrayList<String> coloursList = new ArrayList<>();

        //Declare Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 colours:");

        //Loop until scanner takes 5 inputs
        int i = 1;
        while (i <= 5) {
            coloursList.add(scanner.nextLine());
            i++;
        }
        //Call print colours method
        printColoursList(coloursList);

        //Close scanner object
        scanner.close();

    }

    //static method to iterate through arrayList and print
    public static void printColoursList(ArrayList<String> coloursList) {
        System.out.println();
        System.out.print("The colours entered are: ");

        //for each loop to print through the first 4 elements with comma
        for (String colourName : coloursList.subList(0, 4)) {
            System.out.print(colourName + ", ");
        }

        //To print the last element without the comma
        System.out.print(coloursList.get((4)));

    }
}
