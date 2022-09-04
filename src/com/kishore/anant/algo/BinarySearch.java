package com.kishore.anant.algo;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int right = nums.length-1;
        int left = 0;

        System.out.println(binarySearch(left, right, nums, target));
    }

    public static int binarySearch(int left, int right, int[] nums, int target) {

        if(left > right)
        {
            return -1;
        }

        int mid = (left+right)/2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target) {
           return binarySearch(0, mid-1, nums, target);
        }
        else {
            return binarySearch(mid+1, right, nums, target);
        }


    }



}
