package com.kishore.anant.leetcode.misc;

public class PathSum {


    public static boolean hasPathSum(TreeNode root, int targetSum) {

        return checkRootToLeafPathSum(root, 0, targetSum);
    }

    private static boolean checkRootToLeafPathSum(TreeNode treeNode, int sum, int targetSum) {

        if(treeNode == null)
            return false;
        else{
            if(treeNode.val+sum == targetSum && treeNode.left == null && treeNode.right == null){
                return true;
            }
            else{
                return checkRootToLeafPathSum(treeNode.left, sum+ treeNode.val, targetSum) || checkRootToLeafPathSum(treeNode.right, sum+ treeNode.val, targetSum);
            }
        }

    }


}
