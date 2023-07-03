package in.kishore.anant.july.day2;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int dup = findDuplicate(nums);
        System.out.println(dup);
    }

    public static int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]) -1;
            if(nums[num] < 0)
                return num+1;
            else {
                nums[num] = 0-nums[num];
            }
        }
        return nums.length+1;
    }
}
