package com.kishore.anant.matrix;

public class ShortestPathInBinaryMatrix {

    public static void main(String[] args) {

        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};

        int shortestPathLength = findShortestPath(grid, 0, 0, grid.length, grid[0].length, 0);

        System.out.println(shortestPathLength);
    }

    private static int findShortestPath(int[][] grid, int i, int j, int rows, int cols, int distance) {

        if (i >= rows || j >= cols) {
            return 0;
        }

        if (i == rows - 1 && j == cols - 1)
            return distance;

        for (int k = i; k < rows; k++) {

            for (int l = j; l < cols; l++) {
                int result1 = Integer.MAX_VALUE;
                int result2 = Integer.MAX_VALUE;
                int result3 = Integer.MAX_VALUE;
                if (grid[k][l] == 0) {
                    result1 = findShortestPath(grid, k + 1, l + 1, rows, cols, distance + 1);
                } else if (grid[k][l + 1] == 0) {
                    result2 = findShortestPath(grid, k, l + 1, rows, cols, distance + 1);
                } else if (grid[k + 1][l] == 0) {
                    result3 = findShortestPath(grid, k + 1, l, rows, cols, distance + 1);
                }

                int result = Math.min(result1, Math.min(result2, result3));
                return result;
            }
        }

        return Integer.MAX_VALUE;
    }


}
