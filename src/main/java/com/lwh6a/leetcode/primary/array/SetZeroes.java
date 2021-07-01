package com.lwh6a.leetcode.primary.array;

/**
 * 零矩阵
 *
 * @author lwh6a
 * @since 2021/7/1
 */

public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        boolean[] r = new boolean[matrix.length];
        boolean[] c = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int[] in = matrix[i];
            for (int j = 0; j < in.length; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] in = matrix[i];
            for (int j = 0; j < in.length; j++) {
                if (r[i] || c[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
