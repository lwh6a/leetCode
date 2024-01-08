package com.lwh6a.leetcode.solution;

/**
 * 位1的个数
 *
 * @author lwh6a
 * @since 2024/1/8
 */

public class Solution191 {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            if ((n & 1) == 1) {
                ans++;
            }
            n >>>=1;
        }
        return ans;
    }

    public int hammingWeight2(int n) {
        int ans = 0;
        while (n != 0){
            n &= n - 1;
            ans++;
        }
        return ans;
    }
}
