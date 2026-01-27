package com.lwh6a.leetcode.solution;

/**
 *
 * @author lwh6a
 * @since 2026/1/26
 */

public class Solution808 {

    public double soupServings(int n) {
        if (n >= 4451) {
            return 1.0;
        }
        int size = (n + 24) / 25;
        double[][] dp = new double[n + 1][n + 1];
        return dfs(size, size, dp);
    }

    public double dfs(int a, int b, double[][] dp) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        }
        if (a <= 0) {
            return 1.0;
        }
        if (b <= 0) {
            return 0.0;
        }
        if (dp[a][b] != 0) {
            dp[a][b] = 0.25 * (dfs(a - 4, b, dp) + dfs(a - 3, b - 1, dp) + dfs(a - 2, b - 2, dp) + dfs(a - 1, b - 3, dp));
        }
        return dp[a][b];
    }
}
