package com.kishore.anant.blind75.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {

        int[] result = {-1, -1};
        HashMap<Integer, Integer> valueIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (valueIndexMap.containsKey(compliment)){
                result[0] = valueIndexMap.get(compliment);
                result[1] = i;
                break;
            }
            valueIndexMap.put(nums[i], i);
        }
        return result;
    }
}
