package com.kishore.anant.neetcode;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("anagram", "bagaram"));
    }

    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray, tCharArray);
    }
}
