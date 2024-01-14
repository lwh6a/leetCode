package com.lwh6a.leetcode.solution;

/**
 * 4的幂
 *
 * @author lwh6a
 * @since 2024/1/14
 */

public class Solution342 {

    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
