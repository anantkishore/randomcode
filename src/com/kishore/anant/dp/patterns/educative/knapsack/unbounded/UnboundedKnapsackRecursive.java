package com.kishore.anant.dp.patterns.educative.knapsack.unbounded;

public class UnboundedKnapsackRecursive {

    public static void main(String[] args) {
        UnboundedKnapsackRecursive ks = new UnboundedKnapsackRecursive();
        int[] profits = {15, 50, 60, 90};
        int[] weights = {1, 3, 4, 5};
        int capacity = 8;
        int maxProfit = ks.solveUnboundedKnapsack(profits, weights, capacity);
        System.out.println(maxProfit);
    }

    private int solveUnboundedKnapsack(int[] profits, int[] weights, int capacity) {

        return solveUnboundedKnapsackRecursive(profits, weights, capacity, 0, 0);
    }

    private int solveUnboundedKnapsackRecursive(int[] profits, int[] weights, int capacity, int profit, int index) {

        if (capacity == 0)
            return profit;

        if (index >= profits.length)
            return profit;

        int result1 = 0;
        int result2 = 0;

        if (capacity < weights[index]) {
            result1 = solveUnboundedKnapsackRecursive(profits, weights, capacity, profit, index + 1);
        } else {
            result2 = Math.max(
                    solveUnboundedKnapsackRecursive(profits, weights, capacity - weights[index], profit + profits[index], index),
                    solveUnboundedKnapsackRecursive(profits, weights, capacity, profit, index + 1));
        }

        int result = Math.max(result1, result2);

        return result;

    }
}
