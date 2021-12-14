package com.company.class28.maps.Tasks;

import org.apache.poi.ss.formula.functions.T;

import java.util.TreeMap;

public class Task1 {

    public static void main(String[] args) {

    /*Create a map of a building. Store floor number and it is associated
    company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries
    with duplicate keys and values. Check how many entries you have?
Update company on a 4th floor Remove company on the 7th floor
Print your map
     */

        TreeMap<Integer, String> building = new TreeMap<>();

        building.put(1, "Syntax");
        building.put(2, "BMW");
        building.put(3, "Samsung");
        building.put(4, "Telecom");
        building.put(4, "Delta");
        building.put(6, "BAYER");
        building.put(7, "Festo");

        System.out.println(building.size());

   building.replace(4,"AmericanAirlines");
   building.remove(7,"Festo");
        System.out.println(building);
        System.out.println(building.size());
    }


}
