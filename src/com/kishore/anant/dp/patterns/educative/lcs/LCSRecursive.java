package com.kishore.anant.dp.patterns.educative.lcs;

public class LCSRecursive {

    public static void main(String[] args) {
        LCSRecursive lcs = new LCSRecursive();
        System.out.println(lcs.findLCSLength("abdca", "cbda"));
        System.out.println(lcs.findLCSLength("passport", "ppsspt"));
    }

    private int findLCSLength(String s1, String s2) {


        int i = 0;
        int j = 0;
        int count = 0;
        return findLCSRecursive(s1, s2, i, j, count);
    }

    private int findLCSRecursive(String s1, String s2, int i, int j, int count) {

        if (s1.length() == 0 || s2.length() == 0)
            return count;

        if (i >= s1.length() || j >= s2.length())
            return count;

        int result = 0;
        if (s1.charAt(i) == s2.charAt(j))
            result = findLCSRecursive(s1, s2, i + 1, j + 1, count + 1);

        int result1 = findLCSRecursive(s1, s2, i + 1, j, count);
        int result2 = findLCSRecursive(s1, s2, i, j + 1, count);
        int result3 = Math.max(result1, result2);
        count = Math.max(result, result3);

        return count;
    }
}
