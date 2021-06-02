package com.lwh6a.leetcode.primary.array;

/**
 * 买卖股票最佳时机
 *
 * @author lwh6a
 * @since 2021/5/8
 */

public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                max = max + prices[i + 1] - prices[i];
            }
        }
        return max;
    }
}
