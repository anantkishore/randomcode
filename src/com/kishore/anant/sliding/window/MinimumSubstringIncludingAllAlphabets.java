package com.kishore.anant.sliding.window;

public class MinimumSubstringIncludingAllAlphabets {

    public static void main(String[] args) {

        String text = "ABCDEFDIVGHIJKLMNOPQRSTUVWXYZO";

        MinimumSubstringIncludingAllAlphabets minimumSubstringIncludingAllAlphabets = new MinimumSubstringIncludingAllAlphabets();

        int minimum_substring_len = minimumSubstringIncludingAllAlphabets.findMinimumWindowSubstring(text);

        System.out.println(minimum_substring_len);

    }

    private int findMinimumWindowSubstring(String text) {

        char[] characters = text.toCharArray();

        return -1;
    }


}
