package top150.leetcode;

public class RemoveDuplicatesSortedArrayII {

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,2,3,3};
        int size = new RemoveDuplicatesSortedArrayII().removeDuplicates(nums);
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]+",");
        }
    }

    public int removeDuplicates(int[] nums) {

        int j =1;

        int freq = 1;

        int prev = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] == prev){
                freq++;
                swap(nums,i,j);
                if(freq <= 2) {
                    j++;
                }
            }
            else{
                freq = 1;
                prev = nums[i];
                swap(nums, i, j);
                j++;
            }
        }
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
