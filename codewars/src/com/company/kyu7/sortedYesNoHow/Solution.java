package com.company.kyu7.sortedYesNoHow;

public class Solution {
    public static String isSortedAndHow(int[] array) {
        return ascending(array) ? "yes, ascending" : (descending(array)) ? "yes, descending" : "no";

//        return "";
    }

    private static Boolean ascending(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] - arr[i+1] > 0){
                return false;
            }
        }
        return true;
    }

    private static Boolean descending(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] > 0){
                return false;
            }
        }
        return true;
    }

    /*
      public static String isSortedAndHow(int[] array) {
        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] <= array[i+1]))
            return "yes, ascending";

        if(IntStream.range(0, array.length-1).allMatch(i -> array[i] >= array[i+1]))
            return "yes, descending";

        return "no";
    }
     */
}
