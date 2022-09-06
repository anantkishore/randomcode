package com.kishore.anant.blind75;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        //[3,2,4] ->
        // { {3,0}, {2,1} ... {4,2} } - > 2
        int[] result = new int[2];
        HashMap<Integer, Integer> comp_index_map = new HashMap<>();
        for(int i =0; i < nums.length; i++)
        {
            int curr_num = nums[i];
            int comp = target - curr_num;
            if(comp_index_map.containsKey(comp))
            {
                result[0] = comp_index_map.get(comp);
                result[1] = i;
                break;
            }
            if(!comp_index_map.containsKey(curr_num)) {
                comp_index_map.put(curr_num, i);
            }
        }
        return result;
    }
}
