package com.company.kyu7.toLeetSpeak;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Kata {
    public static String toLeetSpeak(final String speak) {
        final String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        final String[] leetAlphabet = {"@", "8", "(", "D", "3", "F", "6", "#", "!", "J", "K", "1", "M", "N", "0", "P", "Q", "R", "$", "7", "U", "V", "W", "X", "Y", "2"};

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i<=alphabet.length-1; i++){
            map.put(alphabet[i], leetAlphabet[i]);
        }

        System.out.println(map.get("VYZ"));

        return Arrays.stream(speak.split("")).map(c -> map.getOrDefault(c, c)).collect(Collectors.joining());
    }
}

/*
    static String toLeetSpeak(final String speak) {
        return speak.replace("A", "@").replace("B", "8").replace("C", "(").replace("E", "3").replace("G", "6").replace("H", "#").replace("I", "!").replace("L", "1").replace("O", "0").replace("S", "$").replace("T", "7").replace("Z", "2");
    }
 */