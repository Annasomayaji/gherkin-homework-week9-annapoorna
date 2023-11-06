package resources;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_ArrayListIterator {

    public static void main(String[] args) {
        //call the method to iterate through an array list
        createDisplayArrayList();
    }

    public static void createDisplayArrayList() {
        //declare an array list
        ArrayList<Integer> arrayList = new ArrayList<>();

        //add elements to the array list
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        //declare an iterator object
        Iterator<Integer> numList = arrayList.iterator();

        //while loop to print the array list elements
        while (numList.hasNext()){
            System.out.println(numList.next());
        }
    }

}
