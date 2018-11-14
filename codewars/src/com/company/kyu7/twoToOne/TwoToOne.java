package com.company.kyu7.twoToOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoToOne {

    /*
    solution :
        public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

     */

    public static String longest (String s1, String s2) {
        String s3 = s1+s2;

        char[] chars = s3.toCharArray();

        Arrays.sort(chars);

        List<Character> sorted = new ArrayList<>();

        for(int i = 0; i < chars.length-1; i++){
            if(chars[i] != chars[i+1]){
                sorted.add(chars[i]);
            }
        }

        sorted.add(chars[chars.length-1]);

        StringBuilder stringBuilder = new StringBuilder();
        for(char c : sorted){
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
