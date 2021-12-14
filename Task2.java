package com.company.class28.maps.Tasks;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
       Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Belize", "Belmopan");
        countries.put("Papua New Guinea", " Port Moresby");
        countries.put("Trinidad and Tobago", " Port of Spain");
        countries.put("East Timor", "Dilly");
        countries.put("Fiji", "Suva");

        Set<Map.Entry<String, String>> entries = countries.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());

            System.out.println("----------------------");
            Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> country = iterator.next();
                System.out.println(country.getKey() + " " + country.getValue());

            }

        }

    }

}




