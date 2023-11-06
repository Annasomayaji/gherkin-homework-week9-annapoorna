package resources;
/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Programme_8_HashSet {
    public static void main(String[] args) {

        //declare a hash set
        HashSet<Integer> numSet = new HashSet<>();
        numSet.add(4);
        numSet.add(7);
        numSet.add(8);

        //declare object of class
        Programme_8_HashSet obj = new Programme_8_HashSet();

        //call the instance method to find which numbers
        //between 1-10 exist in the set
        obj.findNumbersInHashSet(numSet);

    }

    //Instance method to find which numbers
    //between 1-10 exist in the set
    public void findNumbersInHashSet(HashSet<Integer> numSet) {
        //declare a variable to keep the last index that match the set entry
        //assign it value 1
        int j = 1;

        //for each loop to iterate through the hash set
        for (Integer value : numSet) { //4, 7, 8

            //for loop to check all numbers from 1 to 10
            for (int i = j; i <= 10; ) { //1,2,3,4,5,6,7,8,9,10
                if (i == value) { //1==4?
                    System.out.println(i + " is found in the set.");

                    //When an element found,
                    //assign the value of the last index (found) to j
                    //and reset the inner for loop to that index + 1 (next)
                    //and continue searching through the rest for the existence of the second hash set value
                    j = i + 1;
                    break;
                } else {
                    System.out.println(i + " is NOT found in the set.");
                    i++;//1 is not found
                }
            }
        }

        //To print the REMAINING numbers up to 10 after the last the hash set value is found
        for (int i = j; i <= 10; i++) {
            System.out.println(i + " is NOT found in the set.");
        }

    }

}
