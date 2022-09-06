package com.kishore.anant.blind75;

import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int[] nums = {2,1,2};
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++)  {
            int num = nums[i];
            if(num == 0)
            {
                left++;
            }
            if(num == 2)
            {
                right++;
            }
        }

        for (int i = 0; i < left; i++) {
            nums[i] = 0;
        }

        for (int i = 0; i < right; i++) {
            nums[nums.length-i-1] = 2;
        }

        for (int i = left; i < nums.length-right; i++) {
            nums[i] = 1;
        }

        System.out.print(Arrays.toString(nums));

    }

}
