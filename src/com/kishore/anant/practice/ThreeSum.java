package com.kishore.anant.practice;

import java.util.Arrays;

public class ThreeSum {


    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int i = 0, j = n - 1, k = n - 2;
        int sum = arr[i] + arr[j] + arr[k];

        while (i < j) {

            if (sum == 0) {
                System.out.println(arr[i] + "," + arr[j] + "," + arr[j - 1]);
            } else if (sum < 0) {
                sum -= arr[i];
                sum += arr[++i];
            } else {
                sum -= arr[j];
                j = k - 1;
                sum += arr[j];
            }

        }

    }
}
