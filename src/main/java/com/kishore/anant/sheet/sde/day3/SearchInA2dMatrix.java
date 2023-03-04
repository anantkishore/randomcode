package com.kishore.anant.sheet.sde.day3;

public class SearchInA2dMatrix {

    public static void main(String[] args) {
        boolean flag = searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 11);
        System.out.println(flag);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;

        if (row == 0) {
            return false;
        }
        int col = matrix[0].length;

        return binarySearchInMatrix(matrix, row, col, target);

        /*while(m > -1 && n > -1) {

            if (matrix[m][n] < target) {

                m++;

            } else if (matrix[m][n] > target) {
                n--;
            } else {
                return true;
            }
        }
        return false;*/
    }

    private static boolean binarySearchInMatrix(int[][] matrix, int row, int col, int target) {

        int low = 0;
        int high = row * col - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int i = mid / row;
            int j = mid % row;
            if (matrix[i][j] < target) {
                low = mid + 1;
            } else if (matrix[i][j] > target) {
                high = mid - 1;
            } else if (matrix[i][j] == target) {
                return true;
            }
        }
        return false;
    }
}
