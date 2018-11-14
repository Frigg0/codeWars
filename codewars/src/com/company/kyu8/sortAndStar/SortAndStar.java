package com.company.kyu8.sortAndStar;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);

        String[] c = s[0].split("");
        StringBuilder str = new StringBuilder();

        for(int i=0; i < c.length-1; i++){
            str.append(c[i]).append("***");
        }

        return str.append(c[c.length-1]).toString();
    }
}

/*
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
 */
