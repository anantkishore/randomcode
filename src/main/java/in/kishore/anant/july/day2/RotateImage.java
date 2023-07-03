package in.kishore.anant.july.day2;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

public class RotateImage {

    public static void main(String[] args) {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++){
                if(i != j)
                    swap(matrix, i , j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int left = 0; int right = m-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }

    private static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
