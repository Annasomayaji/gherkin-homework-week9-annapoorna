package resources;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme_2_MarkSheetReWritten {
    public static void main(String[] args) {

        //Declare scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter student's roll number:");
        int rollNo = scanner.nextInt();

        System.out.println("Enter student's marks in Maths:");
        int mathsMarks = scanner.nextInt();

        while(mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Enter student's marks in Maths again:");
            mathsMarks = scanner.nextInt();
        }

        System.out.println("Enter student's marks in Science:");
        int scienceMarks = scanner.nextInt();

        while(scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Enter student's marks in Science again:");
            scienceMarks = scanner.nextInt();
        }

        System.out.println("Enter student's marks in English:");
        int englishMarks = scanner.nextInt();

        while(englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Enter student's marks in English again:");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printMarkSheet(name, rollNo, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //close scanner object
        scanner.close();
    }

    //Calculate result based on whether the marks are above or below 35
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //calculate sum of marks
    public static int sum(int mathsMarks, int scienceMarks, int englishMarks) {
        return (mathsMarks + scienceMarks + englishMarks);
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = "";
        if (result.equals("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "_";
            }

        }
        return grade;
    }

    //Printing the mark sheet
    public static void printMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks,
                                      double total, double percentage, String result, String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                   |");
        System.out.println("| English:" + englishMarks + "                   |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "           |");
        System.out.println("|Grade:" + grade + "              |");
        System.out.println("|___________________________|");

    }

    }
