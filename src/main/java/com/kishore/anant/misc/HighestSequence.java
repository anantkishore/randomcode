package com.kishore.anant.misc;

import java.util.Arrays;

public class HighestSequence {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};

        int index = getIndex(nums);

        System.out.println(index);
    }


    private static int getIndex(int[] nums) {
        int size = nums.length;
        int[] indexofZero = new int[size];
        int[] freqArr = new int[size];
        int j = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            int countOfOnes = 0;
            if (nums[i] == 0) {
                indexofZero[i] = i;
            }
            else{
                while (i < nums.length && nums[i] != 0) {
                    countOfOnes++;
                    i++;
                }
                i--;
            }
            freqArr[j++] = countOfOnes;

        }
        System.out.println(Arrays.toString(freqArr));
        System.out.println(Arrays.toString(indexofZero));

        int max_length = Integer.MIN_VALUE;
        int max_index = -1;
        for (int k = 0; k < j; k++) {
            int freq = freqArr[k];
            int curr_max_length = 0;
            if (freq == 0) {
                if (k + 1 < j && freqArr[k + 1] + 1 > max_length) {
                    curr_max_length = freqArr[k + 1] + 1;
                } else if (k - 1 >= 0 && k + 1 < j && freqArr[k - 1] > 0 && freqArr[k + 1] > 0 && freqArr[k - 1] + freqArr[k + 1] + 1 > max_length) {
                    curr_max_length = freqArr[k - 1] + freqArr[k + 1] + 1;
                }
            }
            if (max_length < curr_max_length) {
                System.out.println(max_length);
                System.out.println(curr_max_length);
                max_length = curr_max_length;
                max_index = indexofZero[k];
            }
        }
        return max_index;

    }
}
