package com.company.kyu7.printerErrors;


public class Printer {

    public static String printerError(String s) {

        /*
                return s.replaceAll("[a-m]", "").length() + "/" + s.length();
         */

        char[] arr = s.toCharArray();

        int sizeArr = arr.length;

        int errorCount = 0;
        for(char c : arr){
            if(c > 'm'){
                errorCount++;
            }
        }

        return errorCount+"/"+sizeArr;
    }
}
