package com.lwh6a.leetcode.solution;

/**
 * 3的幂
 *
 * @author lwh6a
 * @since 2024/1/14
 */

public class Solution326 {

    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}
