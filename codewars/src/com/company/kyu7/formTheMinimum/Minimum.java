package com.company.kyu7.formTheMinimum;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[] values){

        Set<Integer> set = new TreeSet<Integer>(Arrays.stream(values).boxed().collect(Collectors.toList()));
        List<Integer> list = new ArrayList<>(set);

//        int sum = (int) set.stream().mapToDouble(a -> a).sum();

       int lowest = 0;
       for(int i = 0; i < list.size(); i++){
           lowest *= 10;
           lowest += list.get(i);
       }
        return lowest;
    }
}

/*
  public static int minValue(int[] values){
     String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
  }
 */
