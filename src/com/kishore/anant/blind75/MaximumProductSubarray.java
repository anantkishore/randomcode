package com.kishore.anant.blind75;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        int[] nums = {-1,-1,-2,-2};
        System.out.println(maxProduct(nums));
    }

    static int getMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    static int getMin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static int maxProduct(int[] nums) {
        int max_so_far = nums[0];
        int max_ending_here = nums[0];
        int min_ending_here = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int temp = getMax(num, num * max_ending_here, num * min_ending_here);
            min_ending_here = getMin(num, num * max_ending_here, num * min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
