package com.kishore.anant.scalar.array.day5;

public class SearchInASortedMatrix {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int[][] arr2 = {{1, 2},
                        {3, 3}};

        int result = solve(arr1, 2);
        System.out.println(result);

        result = solve(arr2, 3);
        System.out.println(result);
    }

    public static  int solve(int[][] A, int B) {

        int row = A.length;
        int col = A[0].length;

        for (int i=0; i<row;i++){
            if(A[i][col-1] >= B){
                for (int j = 0; j < col; j++) {
                    if(B == A[i][j]){
                        return ((i+1) * 1009 + j+1);
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}

/*
Q1. Search in a row wise and column wise sorted matrix
Solved
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
Note 3: Expected time complexity is linear
Note 4: Use 1-based indexing


Problem Constraints
1 <= N, M <= 1000
-100000 <= A[i] <= 100000
-100000 <= B <= 100000


Input Format
The first argument given is the integer matrix A.
The second argument given is the integer B.


Output Format
Return the position of B and if it is not present in A return -1 instead.


Example Input
Input 1:-
A = [[1, 2, 3]
     [4, 5, 6]
     [7, 8, 9]]
B = 2
Input 2:-
A = [[1, 2]
     [3, 3]]
B = 3


Example Output
Output 1:-
1011
Output 2:-
2019


Example Explanation
Expanation 1:-
A[1][2] = 2
1 * 1009 + 2 = 1011
Explanation 2:-
A[2][1] = 3
2 * 1009 + 1 = 2019
A[2][2] = 3
2 * 1009 + 2 = 2020
The minimum value is 2019



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: Multi Dimensional Array with Integers, For e.g [[2,3,6,7],[2,3,4,5]]
Enter Input Here
Arg 2: A single Integer, For e.g 9
Enter Input Here

 */
