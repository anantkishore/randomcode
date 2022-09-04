package com.kishore.anant.practice;

import java.util.ArrayList;
import java.util.List;

public class LongestPeriodWithVariance {

    public static void main(String[] args) {
        //int[] arr = {2, 3, 1, 3}; int x = 2;
        //int[] arr = {2,3,1,3}; int x = 1;
        //int[] arr = {2,4,3,6,6,3}; int x = 0;
        //int[] arr = {1,2,1,2,2,1,3,1}; int x = 1;
        int[] arr = {8,1,3,11,5,18,18,1,14,11,11,11,11}; int x = 0;
        List<Integer> stableMarketData = getStableMarketData(arr, x);
        System.out.println(stableMarketData.toString());
    }

    private static List<Integer> getStableMarketData(int[] arr, int x) {
        List<Integer> list = new ArrayList<>();
        int i =1;
        boolean flag = false;
        int max_len = Integer.MIN_VALUE;
        int long_max_start_index = 0;
        int long_max_end_index = 0;
        int start = 0;
        int end = 0;
        while (i < arr.length) {
            int diff = arr[i] - arr[i-1] < 0 ? arr[i-1] - arr[i] : arr[i] - arr[i-1];
            if(diff <= x)
            {
                if(!flag)
                    start = i-1;
                    flag = true;
            }
            else if(flag){
                flag = false;
                end = i-1;
                if(max_len < end-start+1)
                {
                    max_len = end-start+1;
                    long_max_start_index = start;
                    long_max_end_index = end;
                }
            }
            i++;
        }
        if(flag){
            long_max_start_index = start;
            long_max_end_index = i-1;
        }
        for (int j = long_max_start_index; j < long_max_end_index+1; j++) {
            list.add(arr[j]);
        }
        return list;
    }
}
