package com.lwh6a.leetcode.solution;

/**
 * 交替位二进制数
 *
 * @author lwh6a
 * @since 2024/2/5
 */

public class Solution693 {

    public boolean hasAlternatingBits(int n) {
        int x = 2;
        while (n != 0){
            if (x == n % 2) {
                return false;
            }
            x = n % 2;
            n /= 2;
        }
        return true;
    }

    public boolean hasAlternatingBits2(int n) {
        int i = n ^ (n >> 1);
        return (i & (i + 1)) == 0;
    }
}
