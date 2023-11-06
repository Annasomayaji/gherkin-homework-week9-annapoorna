package resources.calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        char c = 'Y';

        //Declaring Scanner object
        Scanner scanner = new Scanner(System.in);

        //while loop to iterate when input is 'Y'
        while (c == 'Y') {
            System.out.println("Enter first number: ");
            a = scanner.nextInt();
            System.out.println("Enter second number: ");
            b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/: ");
            c = scanner.next().charAt(0);

            //object creation to call instance method
            Calculator obj = new Calculator();
            //calling the method to perform the required calculation
            obj.calculateResult(a, b, c);
            System.out.println("Would you like to do more calculation? Please enter \"Y\" or \"N\"");
            //store "Y" or "N" in a variable
            c = scanner.next().toUpperCase().charAt(0);
        }
        //closing scanner object
        scanner.close();
    }

}

