package com.kishore.anant.sliding.window;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumWindowSubString {

    public static void main(String[] args) {
        String text = "this is a test string";
        String pattern = "tist";
        int minWindowSize = minimumWindowSubString(text, pattern);
        System.out.println(minWindowSize);
    }

    private static int minimumWindowSubString(String text, String pattern) {

        int[] map = new int[256];

        for (int i = 0; i < pattern.length(); i++) {
            map[pattern.charAt(i)]++;
        }

        int start = 0, end = 0, counter = pattern.length(), minWindowSize = Integer.MAX_VALUE;

        while(end < text.length()){
            final char c1 = text.charAt(end);
            if(map[c1] > 0)
                counter--;

            map[c1]--;
            end++;

            while(counter == 0){
                if(minWindowSize > end-start){
                    minWindowSize = end-start;
                }
                final char c2 = text.charAt(start);
                map[c2]++;
                if(map[c2] > 0)
                    counter++;
                start++;
            }

        }
        return minWindowSize;
    }
}
