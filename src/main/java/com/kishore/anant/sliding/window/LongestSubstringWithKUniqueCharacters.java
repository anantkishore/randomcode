package com.kishore.anant.sliding.window;

public class LongestSubstringWithKUniqueCharacters {

    public static void main(String[] args) {

        String text = "aabbcc";
        int kUnique = 2;
        int longestSubstring = longestSubstringWithKUniqueCharacters(text, kUnique);
        System.out.println(longestSubstring);
    }

    private static int longestSubstringWithKUniqueCharacters(String text, int kUnique) {

        int[] map = new int[128];

        int start = 0, end = 0, counter = 0, maxWindowSize = Integer.MIN_VALUE;

        while(end < text.length()){
            final char c1 = text.charAt(end);
            if(map[c1] == 0)
                counter++;
            map[c1]++;
            end++;
            while(counter > kUnique){
                final char c2 = text.charAt(start);
                map[c2]--;
                if(map[c2] == 0)
                    counter--;
                start++;
            }
            maxWindowSize = Math.max(maxWindowSize, end-start);
        }

        return maxWindowSize;
    }
}
