package com.kishore.anant.blind75.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        //int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};

        int[] result = productOfArrayExceptSelf(nums);
        System.out.println(Arrays.toString(result));

    }

    public static int[] productOfArrayExceptSelf(int[] nums) {

        int[] productArray = new int[nums.length];

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int leftProductOfArray = 1;
        for (int i = 0; i < nums.length; i++) {
            leftProductOfArray *= nums[i];
            left[i] = leftProductOfArray;
        }

        int rightProductOfArray = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            rightProductOfArray *= nums[i];
            right[i] = rightProductOfArray;
        }

        productArray[0] = right[1];
        productArray[nums.length-1] = left[nums.length-2];
        for (int i = 1; i < nums.length-1; i++) {
            productArray[i] = left[i-1]*right[i+1];
        }

        return productArray;
    }
}
