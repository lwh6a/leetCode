package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 * 重塑矩阵
 *
 * @author lwh6a
 * @since 2024/1/27
 */

public class Solution566 {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n > r * c) {
            return mat;
        }

        int[][] res = new int[r][c];
        int i = 0;
        int j = 0;
        for (int[] ints : mat) {
            for (int a : ints) {
                res[i][j] = a;
                if (j < c - 1) {
                    j++;
                }else {
                    i++;
                    j = 0;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int[][] ints = matrixReshape(mat, 1, 4);
        System.out.println(Arrays.deepToString(ints));
    }
}
