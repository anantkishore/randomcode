package in.kishore.anant.july.day1;

public class RainWaterTrapped {

    public static void main(String[] args) {

        int[] arr = {4, 2, 0, 3, 2, 5};

        int result = findTotalRainWaterTrapped(arr);

        System.out.println(result);

    }

    private static int findTotalRainWaterTrapped(int[] arr) {
        int l = 0, r = n-1, leftMax = 0, rightMax = 0, result = 0;

        while (l <= r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] >= leftMax) {
                    leftMax = arr[l];
                } else {
                    result += leftMax - arr[l];
                }
                l++;
            } else {
                if (arr[r] >= rightMax) {
                    rightMax = arr[r];
                } else {
                    result += rightMax - arr[r];
                }
                r--;
            }
        }
        return result;
    }


}
