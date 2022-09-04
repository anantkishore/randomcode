package com.kishore.anant.blind75;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));


    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            int num1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int num2 = nums[j];
                for (int k = 0; k < nums.length; k++) {
                    int num3 = nums[k];
                    if(i!= j && j!= k && i!= k && num1 + num2 + num3 == 0)
                    {
                        ArrayList<Integer> result = new ArrayList<>();
                        result.add(num1);
                        result.add(num2);
                        result.add(num3);
                        results.add(result);
                    }
                }
            }
        }
        return results;
    }
}
