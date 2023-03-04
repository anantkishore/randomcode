package com.kishore.anant.sheet.sde.day2;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int result = findDuplicate(nums);
        System.out.println(result);
    }

    public static int findDuplicate(int[] nums) {
        int sum = (nums.length*(nums.length+1))/2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }


}
