package top150.leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(nums));
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {

        int size = nums.length-1;

        //reverse the whole array
        reverse(nums, 0, size);
        //reverse the first k elements
        reverse(nums, 0, k-1);
        //reverse the last k elements
        reverse(nums, k, size);
    }

    private static void reverse(int[] nums, int i, int j) {

        while(i < j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }
}
