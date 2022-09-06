package com.kishore.anant.dp.patterns.educative.knapsack;

public class EqualSubsetSumPartitionBruteForce {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4};
        System.out.println(canPartition(num));
        num = new int[]{1, 1, 3, 4, 7};
        System.out.println(canPartition(num));
        num = new int[]{2, 3, 4, 6};
        System.out.println(canPartition(num));

    }

    static boolean canPartition(int[] nums) {

        int sum =0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if(sum %2 != 0)
            return false;

        sum = sum/2;

        return canPartitionRecursive(nums, sum, 0);

    }

    private static boolean canPartitionRecursive(int[] nums, int sum, int i) {

        if(sum == 0) {
            return true;
        }

        if(nums.length ==0 || i >= nums.length){
            return false;
        }

        if(nums[i] <= sum){
            if (canPartitionRecursive(nums, sum-nums[i], i+1))
                return true;
        }

        return canPartitionRecursive(nums, sum, i+1);

    }
}
