package com.kishore.anant.scalar.array.day5;

public class FirstMissingInteger {

    public static void main(String[] args) {

        int[] arr1 = {3, 4, -1, 1};
        int[] arr2 = {1,2,0};
        int[] arr3 = {-8,-7,-6};

        int result = firstMissingPositive(arr1);
        System.out.println(result);

        result = firstMissingPositive(arr2);
        System.out.println(result);

        result = firstMissingPositive(arr3);
        System.out.println(result);
    }
    private static int firstMissingPositive(int[] arr) {

        int n = arr.length;
        for(int i=0; i < n; i++){
            int num = arr[i];
            // We traverse the array, and if A[i] is in [1, N] range,
            // we try to put in the index of same value in the array.
            if(num > 0 && num <=n && arr[num-1] != num) {
                swap(arr, i, num-1);
                i--;
            }
        }
        int start = 1;
        for (int i=0; i < n; i++){
            if(arr[i] != start){
                return i+1;
            }
            start++;
        }
        return n+1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*

Problem Description
Given an unsorted integer array, A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.



Problem Constraints
1 <= N <= 1000000

-109 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the first missing positive integer.



Example Input
Input 1:

[1, 2, 0]
Input 2:

[3, 4, -1, 1]
Input 3:

[-8, -7, -6]


Example Output
Output 1:

3
Output 2:

2
Output 3:

1


Example Explanation
Explanation 1:

A = [1, 2, 0]
First positive integer missing from the array is 3.
 */