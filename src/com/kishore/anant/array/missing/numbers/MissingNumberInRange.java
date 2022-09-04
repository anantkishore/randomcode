package com.kishore.anant.array.missing.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberInRange {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 2, 3, 5, 7, 5, 1, 9, 4, 6, 10, 11};
        List<Integer> results = findMissingNumberWithDuplicates(arr);
        System.out.println(results.toString());
    }

    private static List<Integer> findMissingNumberWithDuplicates(int[] arr) {

        List<Integer> results = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0) {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                results.add(i + 1);
            }
        }
        return results;

    }
}
