package com.kishore.anant.dp;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        int res = lengthOfLIS(nums);

        System.out.print(res);
    }


    public static int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int[] lis = new int[n];

        for(int i =0; i < n ; i++)
            lis[i] = 1;

        int max_ref = 0;

        for(int i =1; i < n ; i++)
        {
            int max_ending_here = 1;
            for(int j =0; j < i; j++)
            {
                if(nums[i] > nums[j] && max_ending_here < lis[j]+1)
                {
                    max_ending_here = lis[j] + 1;
                }
                if(max_ending_here > max_ref)
                    max_ref = max_ending_here;
            }
        }
        return max_ref;
    }
}
