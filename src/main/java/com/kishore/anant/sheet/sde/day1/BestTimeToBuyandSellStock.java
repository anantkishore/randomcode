package com.kishore.anant.sheet.sde.day1;

public class BestTimeToBuyandSellStock {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {

        int buy_price = prices[0];
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            max_profit = Math.max(max_profit, prices[i]-buy_price);
            buy_price = Math.min(prices[i], buy_price);
        }
        return max_profit;
    }
}
