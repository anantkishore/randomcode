package com.kishore.anant.dp.patterns.educative.knapsack;

public class ZeroOneKnapSackBottomUp {

    public static void main(String[] args) {
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }


    public static int solveKnapsack(int[] profits, int[] weights, int capacity) {

        if(capacity <= 0 || profits.length == 0 || profits.length != weights.length)
            return 0;

        int n = profits.length;
        int[][] dp = new int[n][capacity+1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < capacity+1; i++) {
            if (weights[0] <= capacity)
                dp[0][i] = profits[0];
        }

        for (int i = 1; i <n; i++) {

            for (int j = 1; j < capacity+1; j++) {
                int profit1=0, profit2=0;
                if (weights[i] <= capacity) {
                    profit1 = profits[i] + dp[i - 1][j-weights[i]];
                }
                profit2 = dp[i-1][j];
                dp[i][j] = Math.max(profit1, profit2);
            }

        }

        return dp[n-1][capacity];


    }


}
