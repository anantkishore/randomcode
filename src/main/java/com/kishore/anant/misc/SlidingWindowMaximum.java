package com.kishore.anant.misc;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1,  3,  -1, -3,  5,  3,  6,  7};
        int[] result = maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(result));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int maxItem = nums[0];

        int[] result = new int[nums.length-k+1];

        if(nums.length == 0 || k == 0){
            return new int[0];
        }

        Deque<Integer> queue = new LinkedList<Integer>();
        int i;
        for (i = 0; i < k; i++) {
            while(!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]){
                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }

        for (;i < nums.length; i++) {

            while((!queue.isEmpty()) && queue.peek() <= i -k){
                queue.removeFirst();
            }

            //while((!queue.isEmpty()) && nums[i])

        }

        return result;
    }
}
