package com.company.kyu7.curingArachnophobia;

public class Spiders {
        public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {

            String[] legz = new String[]{"","^", "/\\", "/╲", "╱╲"};
            String[] legz2 = new String[]{"", "^","/\\", "╱\\", "╱╲"};
            String[] bodies = new String[]{"","(", "((", "((("};
            String[] bodies2 = new String[]{"",")", "))", ")))"};

            StringBuilder eyeDisplay = new StringBuilder();
            int yes = ((int) Math.pow(2.0, bodySize))/2;
            System.out.println(yes);
            while (yes > 0){
                yes--;
                eyeDisplay.append(eye);
            }

            return ""+legz[legSize]+bodies[bodySize]+eyeDisplay+mouth+eyeDisplay+bodies2[bodySize]+legz2[legSize]+"";
    }
}
