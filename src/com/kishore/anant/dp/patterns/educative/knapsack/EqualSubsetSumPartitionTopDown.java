package com.kishore.anant.dp.patterns.educative.knapsack;

public class EqualSubsetSumPartitionTopDown {

    public static void main(String[] args) {
        EqualSubsetSumPartitionTopDown equalSubsetSumPartitionTopDown = new EqualSubsetSumPartitionTopDown();
        int[] num = {1, 2, 3, 4};
        System.out.println(equalSubsetSumPartitionTopDown.canPartition(num));
        num = new int[]{1, 1, 3, 4, 7};
        System.out.println(equalSubsetSumPartitionTopDown.canPartition(num));
        num = new int[]{2, 3, 4, 6};
        System.out.println(equalSubsetSumPartitionTopDown.canPartition(num));
    }

    private boolean canPartition(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0)
            return false;

        sum = sum / 2;

        Boolean dp[][] = new Boolean[nums.length][sum + 1];
        this.canPartitionTopDownRecursive(dp, nums, sum, 0);
        return dp[nums.length - 1][sum - 1];
    }

    private boolean canPartitionTopDownRecursive(Boolean[][] dp, int[] nums, int sum, int i) {

        if (sum == 0)
            return true;

        if (nums.length == 0 || i >= nums.length)
            return false;

        boolean result = false;
        if (dp[i][sum] == null) {

            if (nums[i] <= sum)
                result = canPartitionTopDownRecursive(dp, nums, sum - nums[i], i + 1);
            else
                result = canPartitionTopDownRecursive(dp, nums, sum, i + 1);
        }
        return dp[i][sum] = result;

    }


}
