package com.kishore.anant.blind75;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {

        int n = 7;
        System.out.println(Arrays.toString(countBits(n)));

    }

    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 1; i <= n; i++) {
            result[i] = count(i);
        }
        return result;
    }

    private static int count(int num) {
        int counter = 0;
        while(num != 0){
            int bit = num%2;
            if(bit == 1) {
                counter++;
            }
            num /= 2;
        }
        return counter;
    }
}
