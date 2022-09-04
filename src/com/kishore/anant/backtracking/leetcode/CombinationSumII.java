package com.kishore.anant.backtracking.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/combination-sum-ii/
 */
public class CombinationSumII {

    private static final List<List<Integer>> resultList = new ArrayList<>();

    public static void main(String[] args) {

        new CombinationSumII().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

        for (List<Integer> list : resultList) {
            System.out.println(list.toString());
        }
    }

    protected static void combinationSum2Recursive(int[] candidates, int index, int target, List<Integer> list) {

        if (target == 0) {
            resultList.add(list);
            return;
        }
        if (index < candidates.length) {
            if (candidates[index] > target) {
                combinationSum2Recursive(candidates, index + 1, target, list);
            } else {
                List<Integer> includedList = new ArrayList<>(list);
                List<Integer> excludedList = new ArrayList<>(list);
                includedList.add(candidates[index]);
                combinationSum2Recursive(candidates, index + 1, target - candidates[index], includedList);
                combinationSum2Recursive(candidates, index + 1, target, excludedList);
            }
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        combinationSum2Recursive(candidates, 0, target, new ArrayList<Integer>());
        return resultList;
    }


}
