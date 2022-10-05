package com.kishore.anant.leetcode.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PathSumII {

    List<List<Integer>> paths = new ArrayList<>();

    public static void main(String[] args) {

        for (List<Integer> path : new PathSumII().pathSum(new TreeNode(1), 1)) {
            System.out.println(path.toString());
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        pathSumRecursive(root, 0, targetSum, new ArrayList<Integer>());
        return this.paths;

    }

    public void pathSumRecursive(TreeNode node, int sum, int targetSum, List<Integer> path) {

        if (node == null) {
            return;
        } else {
            path.add(node.val);
            if (node.val + sum == targetSum && node.left == null && node.right == null) {
                List<Integer> sumPath = new ArrayList<>();
                for (int i = 0; i < path.size(); i++) {
                    sumPath.add(path.get(i));
                }
                this.paths.add(sumPath);
            } else {
                if (node.left != null) {
                    pathSumRecursive(node.left, sum + node.val, targetSum, path);
                }
                if (node.right != null) {
                    pathSumRecursive(node.right, sum + node.val, targetSum, path);
                }
            }
            path.remove(path.size() - 1);
        }
    }
}
