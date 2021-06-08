package com.lwh6a.leetcode.primary.array;

/**
 * 旋转图像
 *
 * @author lwh6a
 * @since 2021/6/8
 */

public class RotateImage {

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len/2; i++) {
            for (int j = i; j < len - i -1; j++) {
                int tmp = matrix[i][j];
                int row = len - i - 1;
                int col = len - j - 1;
                matrix[i][j] = matrix[col][i];
                matrix[col][i] = matrix[row][col];
                matrix[row][col] = matrix[j][row];
                matrix[j][row] = tmp;

            }
        }
    }

    public void rotate2(int[][] matrix) {
        int len = matrix.length;
        // 上下交换
        for (int i = 0; i < len/2; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[len - i -1];
            matrix[len - i -1] = tmp;
        }
        // 对角线交换
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
