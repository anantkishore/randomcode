package com.kishore.anant.sheet.sde.day1;

public class MaximumSubarray {

    public static void main(String[] args) {
        //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //int[] nums = {1};
        int[] nums = {5,4,-1,7,8};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {

        int curr_max = nums[0];
        int max_till_here = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max_till_here = Math.max(max_till_here+nums[i], nums[i]);
            curr_max = Math.max(max_till_here, curr_max);
        }
        return curr_max;
    }
}
