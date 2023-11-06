package resources;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Programme_10_TrainLines {
    public static void main(String[] args) {
        //Declare a hash map
        HashMap<String, String> trainlines = new HashMap<>();
        trainlines.put("Bank", "Central, DLR, Northern, WaterLoo& City");
        trainlines.put("Green Park", "Jubilee, Piccadilly, Victoria");
        trainlines.put("Oxford Circus", "Bakerloo, Central, Victoria");

        //Declare scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a station from Bank, Green Park or Oxford Circus please: ");
        String stationName = scanner.nextLine();

        //Call method to find list of tubes running at particular station
        findTubeLines(trainlines, stationName);
        //close scanner object
        scanner.close();

    }

    public static void findTubeLines(HashMap<String, String> trainLines, String stationName) {
        //Iterator<Map.Entry<String, String>> map = trainLines.entrySet().iterator();

        //Iterate through the Hash map
        for(Map.Entry<String, String> map :trainLines.entrySet()){

            //Compare hash map key entry to the console input, ignoring  the case
          if(map.getKey().equalsIgnoreCase(stationName)){
              System.out.println("The tubes running at "+ map.getKey()+ " are :\n"+ map.getValue());
          }
        }

    }

}
