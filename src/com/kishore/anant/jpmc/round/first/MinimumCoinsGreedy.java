package com.kishore.anant.jpmc.round.first;

import java.util.Arrays;

public class MinimumCoinsGreedy {

    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5,10};

        Arrays.sort(coins); // in descending order 10,5,2,1

        int total_count=0;
        int sum = 10;

        for(int coin:coins){        //30, 7
            if(sum >= coin){
                int count = sum/coin; //30/10
                sum -= count*coin;   //
                total_count+=count;
            }
            else if(sum == 0){
                break;
            }
        }
        System.out.print(total_count);


    }
}
