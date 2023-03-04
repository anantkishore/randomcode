package com.kishore.anant.sheet.sde.day4;

import java.util.HashSet;
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            set.add(i);
        }

        int max_count = 0;
        for(int i:nums){
            int count = 0;
            if(!set.contains(i-1)){
                while(set.contains(i)){
                    count++;
                    i++;
                }
            }
            if (max_count < count){
                max_count = count;
            }
        }

        return max_count;
    }
}
