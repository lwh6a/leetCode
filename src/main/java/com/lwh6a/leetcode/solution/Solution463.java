package com.lwh6a.leetcode.solution;

/**
 * 岛屿的周长
 *
 * @author lwh6a
 * @since 2024/1/21
 */

public class Solution463 {

    public int islandPerimeter(int[][] grid) {
        int land = 0;
        int broker = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        broker++;
                    }
                    if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
                        broker++;
                    }
                }
            }
        }
        return land*4 - broker*2;
    }
}
