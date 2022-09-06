package com.kishore.anant.dp.patterns.educative.knapsack;

public class ZeroOneKnapSackMemoization {

    public static void main(String[] args) {

        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }

    private static int solveKnapsack(int[] profits, int[] weights, int capacity) {
        Integer[][] dp = new Integer[profits.length][capacity+1];
        return knapsackRecursive(profits, weights, capacity, 0, dp);
    }

    private static int knapsackRecursive(int[] profits, int[] weights, int capacity, int currentIndex, Integer[][] dp) {
        if (capacity <= 0 || currentIndex >= weights.length)
            return 0;
        if(dp[currentIndex][capacity] != null){
            return dp[currentIndex][capacity];
        }
        int profit1 = 0;
        if(weights[currentIndex] <= capacity)
        {
            profit1 = profits[currentIndex] + knapsackRecursive(profits, weights, capacity-weights[currentIndex], currentIndex+1, dp);
        }
        int profit2 = 0;

        profit2 = knapsackRecursive(profits, weights, capacity, currentIndex+1, dp);
        dp[currentIndex][capacity] = Math.max(profit1, profit2);

        return dp[currentIndex][capacity];
    }


}
