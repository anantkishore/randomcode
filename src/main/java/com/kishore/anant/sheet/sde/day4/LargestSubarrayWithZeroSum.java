package com.kishore.anant.sheet.sde.day4;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {

    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{15,-2,2,-8,1,7,10,23}, 8));
    }

    public static int maxLen(int arr[], int n) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        int leftIndex = -1;
        int rightIndex = -1;
        int maxLenCount = 0;

        for(int i=0; i < arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum)) {
                leftIndex = map.get(sum);
                rightIndex = i;
                if(maxLenCount < rightIndex-leftIndex){
                    maxLenCount = rightIndex-leftIndex;
                }
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLenCount;
    }


}
