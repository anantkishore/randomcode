package com.kishore.anant.practice;

import java.util.Arrays;

public class Max_Stock_Profit_2 {

    public static void main(String[] args) {
        int[] price = {2, 30, 15, 10, 8, 25, 80};
        int n = price.length;
        int profit[] = new int[n];

        for (int i = 0; i < n; i++) {
            profit[i] = 0;
        }

        int max_price = price[n-1];
        for (int i = n-2; i >= 0; i--) {
            if(max_price < price[i])
                max_price = price[i];

            profit[i] = Math.max(max_price-price[i], profit[i+1]);
        }

        System.out.println(Arrays.toString(profit));
    }
}
