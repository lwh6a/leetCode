package com.lwh6a.leetcode.solution;

/**
 * 使用最小花费爬楼梯
 *
 * @author lwh6a
 * @since 2024/3/8
 */

public class Solution746 {

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length + 1;
        int[] dp = new int[len];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[len - 1];
    }

    public int minCostClimbingStairs2(int[] cost) {
        int len = cost.length + 1;
        int prev = 0, curr = 0;
        for (int i = 2; i < len; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
