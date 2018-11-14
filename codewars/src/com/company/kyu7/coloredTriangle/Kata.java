package com.company.kyu7.coloredTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
/*
    if (row.length() == 1) return row.charAt(0);

    String nextRow = "";
    for (int i = 1; i < row.length(); i++) {
      char c1 = row.charAt(i-1), c2 = row.charAt(i);
      switch (c1) {
        case 'R': nextRow += c2=='R'?'R':c2=='G'?'B':'G'; break;
        case 'G': nextRow += c2=='R'?'B':c2=='G'?'G':'R'; break;
        case 'B': nextRow += c2=='R'?'G':c2=='G'?'R':'B'; break;
      }
    }

    return triangle(nextRow); // recurse
 */


    public static char triangle(final String row){
        List<String> list = new ArrayList<>(Arrays.asList(row.split("")));

        return getFinalChar(list).toString().charAt(1);
    }

    private static List<String> getLowRow(List<String> chars) {
        List<String> newRow = new ArrayList<>();

        for (int i = 0; i < chars.size()-1; i++) {
            if (chars.get(i).matches(chars.get(i + 1))) {
                newRow.add(chars.get(i));
            } else if (chars.get(i).matches("B") && chars.get(i+1).matches("G")){
                newRow.add("R");
            } else if (chars.get(i).matches("R") && chars.get(i + 1).matches("G")){
                newRow.add("B");
            } else if (chars.get(i).matches("B") && chars.get(i + 1).matches("R")){
                newRow.add("G");
            } else if(chars.get(i).matches("G") && chars.get(i + 1).matches("B")){
                newRow.add("R");
            } else if(chars.get(i).matches("G") && chars.get(i + 1).matches("R")){
                newRow.add("B");
            } else if(chars.get(i).matches("R") && chars.get(i + 1).matches("B")){
                newRow.add("G");
            }
        }

        return newRow;
    }

    private static List<String> getFinalChar(List<String> chars) {
        List<String> list = new ArrayList<>();

        if(chars.size() <= 1){
            return chars;
        } else
            list = getLowRow(chars);

        if (list.size() > 1) {
            return getFinalChar(list);
        }
        return list;
    }
}

