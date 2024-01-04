package com.lwh6a.leetcode.solution;

/**
 * 买卖股票最佳时间
 *
 * @author lwh6a
 * @since 2024/1/4
 */

public class Solution121 {

    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxIncome = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minP) {
                minP = prices[i];
            }else if (prices[i] - minP > maxIncome) {
                maxIncome = prices[i] - minP;
            }
        }
        return 0;
    }

}
