package com.lwh6a.leetcode.solution;

/**
 * 拖普利茨矩阵
 *
 * @author lwh6a
 * @since 2024/3/9
 */

public class Solution766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
