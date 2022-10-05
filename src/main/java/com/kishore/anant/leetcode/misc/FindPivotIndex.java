package com.kishore.anant.leetcode.misc;

public class FindPivotIndex {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int result = findPivotIndex(nums);
        System.out.println(result);
    }

    private static int findPivotIndex(int[] nums) {

        int arrSum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrSum+= nums[i];
        }

        int leftSum =0;
        int rightSum = arrSum;
        if (rightSum == 0){
            return 0;

        }
        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i-1];
            rightSum -= nums[i-1];
            if (leftSum == rightSum-nums[i]){
                return i;
            }
        }
        return -1;
    }
}
