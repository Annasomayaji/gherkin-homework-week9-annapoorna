package resources.calculate;

/**
 * Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */
public class Calculator {
    //instance method to call required method based on used input
    public void calculateResult(int a, int b, char c) {
        switch (c) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
        }
    }

    //Addition method
    public void addition(int num1, int num2) {
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }

    //Subtraction method
    public void subtraction(int num1, int num2) {
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
    }

    //Multiplication method
    public void multiplication(int num1, int num2) {
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
    }

    //Division method
    public void division(int num1, int num2) {
        System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
    }


}