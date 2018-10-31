package com.company.HighestAndLowest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String HighAndLow(String numbers) {
        String[] str = numbers.split("\\s");
        List<Integer> realNumbers = new ArrayList<>();

        for(String s : str){
            realNumbers.add(Integer.parseInt(s));
        }

        Collections.sort(realNumbers);

        return ""+realNumbers.get(realNumbers.size()-1)+" "+realNumbers.get(0);

        /* Best practice
            public static String HighAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d", max, min);
         */
    }
}
