package com.lwh6a.leetcode.solution;

/**
 * 2的幂
 *
 * @author lwh6a
 * @since 2024/1/12
 */

public class Solution231 {

    public boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
