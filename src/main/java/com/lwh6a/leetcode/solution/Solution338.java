package com.lwh6a.leetcode.solution;

/**
 * 比特为计数
 *
 * @author lwh6a
 * @since 2024/1/14
 */

public class Solution338 {

    public int[] countBits(int n) {
        int[] counts = new int[n + 1];
        counts[0] = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int x = i;
            while (x != 0){
                x &= (x - 1);
                count++;
            }
            counts[i] = count;
        }

        return counts;
    }
}
