package com.lwh6a.leetcode.solution;

/**
 * 颠倒二进制
 *
 * @author lwh6a
 * @since 2024/1/8
 */

public class Solution190 {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(-8 >> 2);
        System.out.println(-8 >>> 31);
    }
}
