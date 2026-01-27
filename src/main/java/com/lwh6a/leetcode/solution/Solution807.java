package com.lwh6a.leetcode.solution;

/**
 *
 * @author lwh6a
 * @since 2026/1/23
 */

public class Solution807 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[] rowMaxs = new int[m];
        int[] colMaxs = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMaxs[i] = Math.max(rowMaxs[i], grid[i][j]);
                colMaxs[j] = Math.max(colMaxs[j], grid[i][j]);
            }
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.min(rowMaxs[i], colMaxs[j]) - grid[i][j];
            }
        }
        return result;
    }
}
