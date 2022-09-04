package com.kishore.anant.string.leetcode;

/*

 Given two strings, string1 and string2, the task is to find
 the smallest substring in string1 containing all characters of string2 efficiently.

 Input: string = “this is a test string”, pattern = “tist”

 Output: Minimum window is “t stri”

 Explanation: “t stri” contains all the characters of pattern.

 */

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";

        int[] map = new int[128];

        for (char c:t.toCharArray()){
            map[c]++;
        }


        int start=0, end=0, i=0, counter=t.length();
        String minString = "";
        int minLength = Integer.MAX_VALUE;

        while (end < s.length()){
            final char c1 = s.charAt(end);
            if(map[c1] > 0)
                counter--;
            map[c1]--;
            end++;
            while (counter == 0){
                if(end-start < minLength){
                    minString = s.substring(start, end+1);
                    minLength = end-start;
                }
                final char c2 = (char) map[s.charAt(start)];
                map[c2]++;
                if(map[c2] > 0){
                    counter++;
                }
                start++;
            }
        }
        System.out.print(minString);
    }
}
