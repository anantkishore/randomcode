package com.kishore.anant.sheet.sde.day3;

public class ReversePairs {

    public static void main(String[] args) {
        System.out.println(reversePairs(new int[]{2,4,3,5,1}));
    }

    public static int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > 2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
