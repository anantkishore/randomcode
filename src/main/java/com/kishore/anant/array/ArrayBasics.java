package com.kishore.anant.array;

import java.util.HashMap;

public class ArrayBasics {

    public static void main(String[] args) {


        int[] array = new int[10];

        System.out.println(array.length);
        /*

        1   2
        100 104 108 ..... 140
        array
        array + 0*4 = 100
        array + 1*4 = 104


         */

        for (int i = 0; i < 10; i++) {
            array[i] = i + 1; // 1
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println(array[5]);

        array[0]++;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //array[11]++;








































        /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


        int[] nums = {2, 9, 7, 15};
        int target = 9;


        int[] result = findPair(nums, target);

        System.out.println(Arrays.toString(result));

        Input: s = "abcabcbb";
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/

        String text = "abcxabcbb";
        int result = longestSubStringWithoutRepeatation(text);
        System.out.println(result);

    }

    private static int longestSubStringWithoutRepeatation(String text) {

        HashMap<Character, Integer> map = new HashMap<>();
        int[] frequency = new int[256];
        int windowStart = 0;
        int windowEnd = 0;
        int max_length_substring = Integer.MIN_VALUE;
        int i = 0;
        for (char c : text.toCharArray()) {

            frequency[c]++;
            if (frequency[c] == 1) {
                windowEnd++;
                if (windowEnd - windowStart > max_length_substring) {
                    max_length_substring = windowEnd - windowStart;
                }
            } else {
                if (map.containsKey(c)) {
                    int prevIndex = map.get(c);
                    windowStart = prevIndex + 1;

                }
            }
            map.put(c, i);
            i++;
        }
        return max_length_substring;

    }

    private static int[] findPair(int[] nums, int target) {
        int[] result = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            map.put(target - temp, i);

        }
        return result;

    }


}
