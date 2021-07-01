package com.lwh6a.leetcode.primary.array;

/**
 * 旋转矩阵
 *
 * @author lwh6a
 * @since 2021/7/1
 */

public class RotateMatrix {

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            // 此处j < len - 1 - i是为了少操作一列，因为最后一列不需要操作，是这一行放过来的，
            // 把一行或一列的头放到尾，所以最后一个不需要操作
            for (int j = i; j < len - 1 - i; j++) {
                int t = matrix[i][j];
                int l = len - 1 - i;
                int c = len - 1 - j;
                matrix[i][j] = matrix[c][i];
                matrix[c][i] = matrix[l][c];
                matrix[l][c] = matrix[c][l];
                matrix[i][c] = t;

            }
        }
    }
}
