package com.kishore.anant.dp.patterns.educative.palindromic;

public class LongestPalindromicSubsequenceBruteForce {

    public static void main(String[] args) {

        String str = "pqr";
        int maxLength = findLongestSubsequence(str, 0, str.length()-1);

        System.out.println(maxLength);
    }

    private static int findLongestSubsequence(String str, int startIndex, int endIndex) {

        if(startIndex > endIndex) {
            return 0;
        }

        if(startIndex == endIndex) {
            return 1;
        }

        if(str.charAt(startIndex) == str.charAt(endIndex)){
            return 2+ findLongestSubsequence(str, startIndex+1, endIndex-1);
        }
        else{
            int result1 = findLongestSubsequence(str, startIndex+1, endIndex);
            int result2 = findLongestSubsequence(str, startIndex, endIndex-1);
            return Math.max(result1, result2);
            }
    }
}
