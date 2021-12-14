package com.company.class28.maps.Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer,
7879885= TV etc )Retrieve all keys and values from a Best Buy map
using EntrySet.
         */

        HashMap<Integer, String> bestBuy = new HashMap<>();

        bestBuy.put(6415933, "DigitalCamera");
        bestBuy.put(6401738, "smartTv");
        bestBuy.put(6424707, "KitchenAid");
        bestBuy.put(6424701, "Projector");
        bestBuy.put(4480802, "USB Adapter");
        bestBuy.put(6265752, "DVD Player");

        Set<Map.Entry<Integer,String>>entrySet=bestBuy.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet

        ){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }

    }
}
