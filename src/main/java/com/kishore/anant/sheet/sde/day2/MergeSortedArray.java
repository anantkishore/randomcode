package com.kishore.anant.sheet.sde.day2;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, nums2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        if(m ==0){
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int right = nums1.length-1;
        int left = m-1;
        while(left >= 0){
            nums1[right] = nums1[left];
            left--;
            right--;
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        int n1 = n;
        int n2 = 0;
        int i = 0;
        while(n1 < m+n && n2 < n){
            if (nums1[n1] <= nums2[n2]){
                nums1[i++] = nums1[n1++];
            }
            else{
                nums1[i++] = nums2[n2++];
            }
        }

        while (n2 < n){
            nums1[i++] = nums2[n2++];
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
