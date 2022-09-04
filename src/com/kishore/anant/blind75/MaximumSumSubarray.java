package com.kishore.anant.blind75;

public class MaximumSumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        //[-2,1,-3,4,-1,2,1,-5,4]
        // Cadence algorithm
        int curr_sum = nums[0];
        int max_sum_occurred = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            curr_sum = Math.max(nums[i], curr_sum+nums[i]);
            if(curr_sum > max_sum_occurred)
            {
                max_sum_occurred = curr_sum;
            }
        }
        return max_sum_occurred;
    }
}
