package com.kishore.anant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution5 {

    public static void main(String[] args) {


        int[] arr = {3, 2, 5, 0, 1, 6};
        int target = 4;
        Map<Integer, Integer> intMap = new HashMap<>();
        int[] result = null;
        intMap.put(target - arr[0], 0);
        for (int i = 1; i < arr.length; i++) {
            if (intMap.get(arr[i]) != null) {
                result = new int[]{intMap.get(arr[i]), i};
                break;
            }
            intMap.put(target - arr[i], i);
        }
        if (result == null)
            System.out.println("");
        else
            System.out.println(Arrays.toString(result));
    }
}
