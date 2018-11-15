package com.company;


import com.company.kyu7.twoFighters.Fighter;
import com.company.kyu7.twoFighters.Kata;
import com.company.kyu8.trafficLight.TrafficLights;

public class Main {
    public static void main(String[] args) {
//        System.out.println(SortAndStar.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
//        System.out.println(Minimum.minValue(new int[] {1,3,1}));
//        System.out.println(Kata.toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG YZ"));
//        System.out.println(Kata.subtractSum(12565));
//        System.out.println(TrafficLights.updateLight("redddddddddd"));
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    }
}