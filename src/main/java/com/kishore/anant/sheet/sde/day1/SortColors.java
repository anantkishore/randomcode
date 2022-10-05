package com.kishore.anant.sheet.sde.day1;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        //int[] nums = {2,0,1};
        //int[] nums = {1,2,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {

        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                left++;
            if (nums[i] == 2)
                right++;
        }
        for (int i = 0; i < left; i++) {
            nums[i] =0;
        }
        for (int i = left; i <= right; i++) {
            nums[i] = 1;
        }
        for (int i = 0; i < right ; i++) {
            nums[nums.length-1-i] = 2;
        }

    }

}
