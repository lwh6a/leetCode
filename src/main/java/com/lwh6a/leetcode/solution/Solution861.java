package com.lwh6a.leetcode.solution;

/**
 *
 * @author lwh6a
 * @since 2026/3/24
 */

public class Solution861 {

    public int matrixScore(int[][] grid) {
        int res = 0;
        int l = grid.length;
        int k = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < k; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }

        for (int i = 0; i < k; i++) {

            int c = 0;
            for (int j = 0; j < l; j++) {
                c += grid[j][i];
            }

            res += Math.max(c, l - c) * (1 << (k - i - 1));
        }
        return res;
    }
}
