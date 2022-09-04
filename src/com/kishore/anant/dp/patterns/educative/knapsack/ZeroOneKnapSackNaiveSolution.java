package com.kishore.anant.dp.patterns.educative.knapsack;

public class ZeroOneKnapSackNaiveSolution {

    public static int solveKnapsack(int[] profits, int[] weights, int capacity, int i) {
        if(i >= weights.length){
            return 0;
        }
        if(capacity < weights[i]) {
            return 0;
        }
        return Math.max(profits[i] + solveKnapsack(profits, weights, capacity-weights[i], i+1), solveKnapsack(profits,weights, capacity, i+1));
    }

    public static void main(String[] args) {
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit =solveKnapsack(profits, weights, 7, 0);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = solveKnapsack(profits, weights, 6, 0);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }
}
