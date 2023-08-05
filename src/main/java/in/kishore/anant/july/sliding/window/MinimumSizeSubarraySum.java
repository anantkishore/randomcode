package in.kishore.anant.july.sliding.window;

public class MinimumSizeSubarraySum {


    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int result = minSubArrayLen(target, nums);

        System.out.println(result);

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0 ;
        int end = 0;
        int sum = 0;
        int minWindow = Integer.MAX_VALUE;
        while(end < nums.length){
            sum += nums[end];
            while(sum >= target){
                if(minWindow > end-start+1){
                    minWindow = end-start+1;
                }
                sum -= nums[start];
                start++;
            }
            end++;
        }
        if(minWindow == Integer.MAX_VALUE){
            return 0;
        }
        return minWindow;
    }
}
