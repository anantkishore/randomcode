package com.kishore.anant.blind75;


import java.util.Arrays;
import java.util.HashSet;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        //  1  2  6  24
        // 24 24 12   4
        //
        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        HashSet<Integer> zeroIndex = new HashSet<Integer>();
        int product = 1;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
               zeroIndex.add(i);
            }
            else
            {
                product *= nums[i];
            }
        }
        if(zeroIndex.size() > 1){
            return result;
        }
        for (int j = 0; j < nums.length; j++) {
            if(zeroIndex.size() == 1)
            {
                if(zeroIndex.contains(j)) {
                    result[j] = product;
                    break;
                }
            }
            else {
                result[j] = product/nums[j];
            }

        }
        return result;
    }

}
