package com.company.class28.maps.Tasks;

import org.apache.commons.math3.random.EmpiricalDistribution;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {

        TreeMap<Integer, String> object = new TreeMap<>();
        Person object1 = new Person(248812, " Herr Heiko", " Reichmann", 45, 5420.15);
        String value1 = object1.printUser();
        object.put(248812, value1);

        Person object2 = new Person(56213, "Frau AnneMarie", "Metzger", 62, 3650.45);
        String value2 = object2.printUser();
        object.put(56213, value2);


        Set<Map.Entry<Integer, String>> entrySet = object.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet

        ) {

            System.out.println(entry);
        }
    }
    }
