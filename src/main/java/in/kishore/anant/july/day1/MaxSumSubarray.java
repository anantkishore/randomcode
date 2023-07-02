package in.kishore.anant.july.day1;

public class MaxSumSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int result = maxSumSubarray(arr);

        System.out.print(result);
    }



    private static int maxSumSubarray(int[] arr) {


        int max_till_here = arr[0];
        int curr_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max_till_here = Math.max(arr[i], max_till_here+arr[i]);
            curr_max = Math.max(max_till_here, curr_max);
        }

        return curr_max;

    }
}
