package com.kishore.anant.array.merge;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        new MergeTwoSortedArrays().merge(new int[]{5, 8, 9}, 3, new int[]{4, 7, 8}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
