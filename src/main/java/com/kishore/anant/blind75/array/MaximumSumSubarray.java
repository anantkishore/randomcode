package com.kishore.anant.blind75.array;

public class MaximumSumSubarray {

    public static void main(String[] args) {

        int[] nums = {5, 4, -1, 7, 8};
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSumSubarray = maximumSumSubArray(nums1);
        System.out.print("Maximum Subarray Sum is::" + maxSumSubarray);
    }

    private static int maximumSumSubArray(int[] nums) {
        int max = nums[0];

        int max_incl_here = nums[0];
        int max_excl_here = Integer.MIN_VALUE;
        int max_till_here = nums[0];
        System.out.println("max_incl_here::" + max_incl_here);
        System.out.println("max_excl_here::" + max_excl_here);
        System.out.println("max_till_here::" + max_till_here);
        System.out.println();
        for (int i = 1; i < nums.length; i++) {
            max_incl_here = max_incl_here + nums[i];
            max_excl_here = nums[i];
            max_till_here = Math.max(max_till_here, max_excl_here);
            max_incl_here = Math.max(max_incl_here, max_excl_here);
            System.out.println("max_incl_here::" + max_incl_here);
            System.out.println("max_excl_here::" + max_excl_here);
            System.out.println("max_till_here::" + max_till_here);
            System.out.println();
        }

        return max_till_here;
    }
}
