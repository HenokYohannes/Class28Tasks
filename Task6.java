package com.company.class28.maps.Tasks;

import java.util.ArrayList;
import java.util.Collection;

public class Task6 {
    public static void main(String[] args) {


    /* Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers*/

        Collection<Integer>object=new ArrayList<>();
        object.add(34);
        object.add(45);
        object.add(59);
        object.add(34);
        object.add(60);
        object.add(30);

          Integer sum=0;

        System.out.println(object);

for (Integer obj :object

) {
    sum+=obj;
}
        System.out.println("The sum of all Int numbers ="+ sum);
}
    }
