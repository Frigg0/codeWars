package com.company.kyu7.coloredTriangle;

public class CleverSolution {
    public static char triangle(final String row){
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
    }
}
