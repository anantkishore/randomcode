package com.kishore.anant.freshworks;

public class FindIsland {

    /*
    Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island. For example, the below matrix contains 5 islands

Example:

Input : mat[][] = {{1, 1, 0, 0, 0},
                   {0, 1, 0, 0, 1},
                   {1, 0, 0, 1, 1},
                   {0, 0, 0, 0, 0},
                   {1, 0, 1, 0, 1}}
Output : 5
     */

    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}};
    }

        public int numIslands(int[][] grid) {
        /*
            1,1,1
            0,1,0
            1,1,1


        */
            int island = 0;
            int n = grid.length;
            int m = grid[0].length;

            for(int i =0; i<n; i++)
            {
                for(int j =0; j<m; j++)
                {
                    if(grid[i][j] == 1){
                        island++;
                        mark_connected_island(i, j, n, m, grid);
                    }
                }
            }
            return island;
        }

        public void mark_connected_island(int i, int j, int n, int m, int[][] grid)
        {
            if(i+1 < n && grid[i+1][j] == 1)
            {
                grid[i+1][j] = 0;
                mark_connected_island(i+1, j, n, m, grid);
            }
            if(i-1 > -1 && grid[i-1][j] == 1)
            {
                grid[i-1][j] = 0;
                mark_connected_island(i-1, j, n, m, grid);
            }
            if(j+1 < m && grid[i][j+1] == 1)
            {
                grid[i][j+1] = 0;
                mark_connected_island(i, j+1, n, m, grid);
            }
            if(j-1 >= 0 && grid[i][j-1] == 1)
            {
                grid[i][j-1] = 0;
                mark_connected_island(i, j-1, n, m, grid);
            }
        }




}
