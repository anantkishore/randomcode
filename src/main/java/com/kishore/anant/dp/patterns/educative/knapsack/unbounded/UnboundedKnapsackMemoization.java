package com.kishore.anant.dp.patterns.educative.knapsack.unbounded;

public class UnboundedKnapsackMemoization {

    public static void main(String[] args) {
        UnboundedKnapsackMemoization unboundedKnapsackMemoization = new UnboundedKnapsackMemoization();
        int[] profits = {15, 50, 60, 90};
        int[] weights = {1, 3, 4, 5};
        //System.out.println(unboundedKnapsackMemoization.solveKnapsackMemoization(profits, weights, 8));
        //System.out.println(unboundedKnapsackMemoization.solveKnapsackMemoization(profits, weights, 6));
    }

  /*  private boolean solveKnapsackMemoization(int[] profits, int[] weights, int capacity) {


        int dp = solveKnapsackMemoizationTable(profits, weights, capacity, 0);
    }

    private int solveKnapsackMemoizationTable(int[] profits, int[] weights, int capacity, int i) {
        int[][] dp = new int[profits.length][capacity + 1];

        
    }*/

}
