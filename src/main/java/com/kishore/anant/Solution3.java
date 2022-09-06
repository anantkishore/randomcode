package com.kishore.anant;

public class Solution3 {

    /*
    Find the maximum value in a given Bitonic array.
    An array is considered bitonic if it is monotonically increasing and then monotonically decreasing.
    Monotonically increasing or decreasing means that for any index i in the array arr[i] != arr[i+1].

Example 1:

Input: [1, 3, 8, 12, 4, 2]
Output: 12
Explanation: The maximum number in the input bitonic array is '12'.
     */

    public static void main(String[] args) {

        //int[] arr = {1, 3, 8, 12, 4, 2};
        //int[] arr = {3, 8, 3, 1};
        //int[] arr = {1, 3, 8, 12};
        int[] arr = {10, 9, 8};
        int right = arr.length;
        int index = binarySearch(arr, 0, right);
        if (index != -1)
            System.out.print(arr[index]);
        else
            System.out.println("not found!");
    }

    static int binarySearch(int[] arr, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if ((mid == arr.length - 1 && arr[mid] > arr[mid - 1]) || (mid == 0 && arr[0] > arr[1])) {
            return mid;
        }

        if (mid - 1 >= 0 && mid + 1 < arr.length) {

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return binarySearch(arr, mid, right);
            } else {
                return binarySearch(arr, 0, mid);
            }
        }
        return -1;
    }


}
