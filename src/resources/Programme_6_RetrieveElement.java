package resources;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 *array list
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();

        //Declare Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 car models:\t");
        for (int i = 0; i < 5; i++) {
            carList.add(scanner.nextLine());
        }
        System.out.println("Which model name you want to retrieve, from 1 to 5:\t");
        //read the input and subtract 1 to get the correct index for the array list
        //because array index starts with 0
        int index = scanner.nextInt() - 1;

        //call the method to retrieve an element
        retrieveAnElement(carList, index);

        //Close scanner object
        scanner.close();
    }

    //static method to retrieve an element from the array list
    public static void retrieveAnElement(ArrayList<String> carList, int index) {
        System.out.println(carList.get(index));
    }
}
