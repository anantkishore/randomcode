package top150.leetcode;

public class JumpGame {

    public static void main(String[] args) {
        
        int[] nums = {2,3,1,1,4};
        boolean isPossible = new JumpGame().canJump(nums);
        System.out.println(isPossible);
        
    }

    public boolean canJump(int[] nums) {

        int reachable = 0;
        int len = nums.length;

        for (int i = 0; i < nums.length; i++) {
            reachable = Math.max(i+nums[i], reachable);
            if(reachable >= len-1) return true;
        }
        return false;
    }
}
