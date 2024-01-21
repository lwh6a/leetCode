package com.lwh6a.leetcode.solution;

/**
 * 提莫攻击
 *
 * @author lwh6a
 * @since 2024/1/21
 */

public class Solution495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        int expired = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] >= expired) {
                count+=duration;
            }else {
                count+= (timeSeries[i] + duration) - expired;
            }
            expired = timeSeries[i] + duration;
        }
        return count;
    }
}
