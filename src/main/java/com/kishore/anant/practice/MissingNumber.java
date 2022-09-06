package com.kishore.anant.practice;

public class MissingNumber {

    public static void main(String[] args) {


    }

    public static int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while(nums[num] != -1){
                int temp = nums[num];
                nums[num] = -1;
                
            }
        }
        return 0;
    }
}
