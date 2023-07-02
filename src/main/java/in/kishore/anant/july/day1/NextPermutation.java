package in.kishore.anant.july.day1;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] nums = {5,4,7,5,3,2};
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {

        int l = 0, r = nums.length - 1;
        boolean possible = false;
        int pos = -1;

        while (r > 0) {
            if (nums[r-1] < nums[r]) {
                pos = r-1;
                break;
            }
            r--;
        }

        if(pos >= 0){
            possible = true;
            int minDigit = Integer.MAX_VALUE;
            int right = nums.length-1;
            while(right > pos && nums[pos] >= nums[right]){
                right--;
            }
            swap(nums, right, pos);
        }

        if (!possible) {
            for (int i = 0; i < nums.length / 2; i++) {
                swap(nums, i, nums.length - 1 - i);
            }
        } else {
            for (int i = pos+1; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        swap(nums, i, j);
                    }
                }
            }
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
