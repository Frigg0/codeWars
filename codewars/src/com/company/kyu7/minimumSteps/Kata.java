package com.company.kyu7.minimumSteps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
        List<Integer> list = Arrays.stream(numbers).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        if(k == 0){
            return 0;
        } else {
            int testingNumber = list.get(0)+list.get(1);
            System.out.println(testingNumber);
            int operationNumber = 1;
            System.out.println(operationNumber);

            for(int i = 2; i<numbers.length; i++){
                if(testingNumber < k){
                    System.out.println("testing "+testingNumber+ " k "+k);
                    testingNumber += list.get(i);
                    System.out.println(testingNumber + " boucle");
                    operationNumber ++;
                    System.out.println(operationNumber + " boucle");
                }
            }
            return operationNumber;
        }
    }
}

/*
    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int sum = 0;
        int i = 0;
        while(sum < k) {
          sum+=numbers[i];
          i++;
        }
        return i-1;
    }
 */
