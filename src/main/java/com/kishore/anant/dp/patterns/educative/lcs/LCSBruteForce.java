package com.kishore.anant.dp.patterns.educative.lcs;

public class LCSBruteForce {

    public static void main(String[] args) {

        String s1 = "abdca";
        String s2 = "cbda";

        int lcs = findLCS(s1, s2);

        System.out.println(lcs);
    }

    public static int findLCS(String s1, String s2) {

        int i = 0;
        int max_lcs_length = Integer.MIN_VALUE;

        while (i < s1.length()) {
            int start = i;
            for (int k = 0; k < s2.length(); k++) {
                int counter = 0;
                while (k < s2.length() && i < s1.length() && s1.charAt(i) == s2.charAt(k)) {
                    i++;
                    k++;
                    counter++;
                }
                if (counter > max_lcs_length) {
                    max_lcs_length = counter;
                }
            }
            i = start + 1;
        }
        return max_lcs_length;
    }


}
