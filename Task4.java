package com.company.class28.maps.Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task4 {
/*
 /* Create a Map that will store Employee name and salary.
     Write a logic to retrieve an employee who gets the highest salary.
     Output should be in the below format
     John Smith=$100000 */


    public static void main(String[] args) {

        Map<String, Integer> employee = new HashMap<>();
        employee.put("Sebastian G", 95505);
        employee.put("Olga", 95506);
        employee.put("Mustafa", 95501);
        employee.put("Irina K.", 95503);
        employee.put("Jimmy.C", 95504);
        employee.put("Irina K", 95502);
        employee.put("Roman S", 95500);
        employee.put("Marina", 95507);

        Set<Map.Entry<String,Integer>>entrySet= employee.entrySet();
  Map.Entry<String,Integer> highSalary=null;

        for(Map.Entry<String,Integer>entry:entrySet

        ){

   if(highSalary==null|| entry.getValue().compareTo(highSalary.getValue())>0){

   highSalary=entry;
   }


       }
        System.out.println(highSalary.getKey()+ "=$" + highSalary.getValue());

    }


}
