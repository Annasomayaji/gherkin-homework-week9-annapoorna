package resources;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {


        //Declare a hash map
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Peter", 35);
        people.put("Sarah", 36);
        people.put("Tom", 44);
        people.put("Alisha", 25);

        //call method to iterate and print the map entry set
        printEntryValues(people);
    }

    //Static method to print values is  the hash map
    public static void printEntryValues(HashMap<String, Integer> people) {

        //option 1
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            System.out.print(person.getKey()+ " " + person.getValue() + ",");
        }
        System.out.println();
        System.out.println("***************************************************");

        //option 2
        Iterator<Map.Entry<String, Integer>> map = people.entrySet().iterator();
        while (map.hasNext()) {
            System.out.println(map.next()+" ");
        }


    }
}
