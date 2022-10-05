package com.kishore.anant.blind75.array;

public class MaxProfits {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int maxProfit = maxProfit(prices);

        System.out.println(maxProfit);

    }

    private static int maxProfit(int[] prices) {

        int min_start_index = 0;
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {

            max_profit = Math.max(max_profit, prices[i]-prices[min_start_index]);
            min_start_index = prices[min_start_index] > prices[i] ? i : min_start_index;
        }

        return max_profit;
    }
}
