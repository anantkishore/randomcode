package com.kishore.anant.sheet.sde.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NextPermutation {

    public static void main(String[] args) {

        //int[] nums = {1,2,3};
        //int[] nums = { 3, 2, 1};
        //int[] nums = {1,3,2};
        //int[] nums = {1,7,6,4,2};
        //int[] nums = {2,3,1};
        //int[] nums = {1,5,1};
        int[] nums = {5,1,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void nextPermutation(int[] nums) {
        boolean ngePossible = false;
        int left = nums.length-2;
        int right = nums.length-1;
        int pos = right;
        while (left >= 0 && nums[left] >= nums[right]){
            left--;
            right--;
        }
        System.out.println(left);
        System.out.println(right);

        if (left >=0){
            while(pos >= 0 && nums[pos] <= nums[left]){
                pos--;
            }
            if (pos >= 0 && nums[pos] > nums[left]) {
                ngePossible = true;
                int temp = nums[pos];
                nums[pos] = nums[left];
                nums[left] = temp;
            }
            // 1,3,2  -> 3,1,2
            // 1,6,4,2 -> 2,1,4,6
            System.out.println(Arrays.toString(nums));
            for (int i = left+1; i <nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i]>nums[j]){
                        swap(nums, i, j);
                    }
                }
            }
        }

        System.out.println(Arrays.toString(nums));

        if(!ngePossible){
            int[] newArr = Arrays.stream(nums)
                    .boxed()
                    .sorted()
                    .mapToInt(Integer::intValue)
                    .toArray();
            for (int i = 0; i < newArr.length; i++) {
                nums[i] = newArr[i];
            }
        }
    }

    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
