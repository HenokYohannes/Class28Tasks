package com.company.class28.maps.Tasks;

import java.util.Collection;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        /* Create the collection that will store single uniques Objects of a String type in which order is preserved.
     Write a logic to concatenate all string from the collection.*/


        Collection<String> obj = new LinkedList<>();
        obj.add("Bed");
        obj.add("Hat");
        obj.add("Laptop");
        obj.add("Book");
        obj.add("Brash");

        for (String objects : obj) {


        }
        System.out.println(obj);
    }
}