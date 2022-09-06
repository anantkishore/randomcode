package com.kishore.anant.array.designgurus;

public class MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int[] nums1 = {2, 3, 4, 1, 5};
        int k1 = 2;

        int result1 = findMaxSumSubarraySizeK(nums, k);
        int result2 = findMaxSumSubarraySizeK(nums1, k1);

        System.out.println(result1);
        System.out.println(result2);

    }

    public static int findMaxSumSubarraySizeK(int[] nums, int k) {
        int windowSum = 0;
        int max_sum = Integer.MIN_VALUE;
        int windowStart = 0;
        for (int i = 0; i < nums.length; i++) {
            windowSum += nums[i];
            if (i >= k - 1) {
                max_sum = Math.max(max_sum, windowSum);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return max_sum;
    }
}
