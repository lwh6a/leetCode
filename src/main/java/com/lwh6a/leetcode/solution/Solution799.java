package com.lwh6a.leetcode.solution;

/**
 *
 * @author lwh6a
 * @since 2026/1/21
 */

public class Solution799 {

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] ds = new double[query_row + 10][query_row + 10];
        ds[0][0] = poured;
        for (int i = 0; i < query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if (ds[i][j] <= 1) {
                    continue;
                }
                ds[i + 1][j] += (ds[i][j] - 1) / 2.0;
                ds[i + 1][j + 1] += (ds[i][j] - 1) / 2.0;
            }
        }
        return Math.min(ds[query_row][query_glass], 1.0);
    }

    ;

    public static void main(String[] args) {
        Solution799 solution799 = new Solution799();
        System.out.println(solution799.champagneTower(25, 6, 1));
    }

}
