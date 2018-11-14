package com.company.kyu7.LargestNumberArrangement;

import java.util.*;

public class LargestArrangement {
    public static long largestArrangement(int[] arr){
        /*
        Solution pas trouvée problème quand input de départ 50, 5, 1, 9
        je compare que les entrées d'index par pair du coup : 9, 50, 5, 1 une fois sorted
        je sors la valeur 95051 au lieu de 95501

        solution :
        return Long.parseLong(StringUtils.join(Arrays.stream(arr).boxed().sorted((a, b) -> Integer.parseInt(""+b+a) - Integer.parseInt(""+a+b)).mapToInt(i -> i).mapToObj(String::valueOf).toArray(String[]::new), ""));
         */

        List<String> strFromInt = new ArrayList<>();
        for(int i : arr){
            strFromInt.add(String.valueOf(i));
        }


        strFromInt.sort(Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();
        for(String s : strFromInt){
            list.add(Integer.parseInt(s));
        }


        StringBuilder toReturn = new StringBuilder();
        if(list.size() == 1){
            toReturn.append(list.get(0));
        } else{
            for(int i=0; i<list.size()-1; i+=2){
                String it1 = ""+list.get(i)+list.get(i+1)+"";
                String it2 = ""+list.get(i+1)+list.get(i)+"";

                System.out.println("1: " +it1);
                System.out.println("2: " +it2);

                if(Integer.compare(Integer.parseInt(it1), Integer.parseInt(it2)) > 0){
                    toReturn.append(it1);
                } else {
                    toReturn.append(it2);
                }

                if(list.get(i+1) == list.get(list.size()-2)){
                    toReturn.append(list.get(list.size()-1));
                }
            }
        }

        if(!toReturn.toString().isEmpty()){
            return Long.parseLong(toReturn.toString());
        } else
            return 0;
    }
}
