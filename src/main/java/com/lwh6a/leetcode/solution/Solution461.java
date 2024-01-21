package com.lwh6a.leetcode.solution;

/**
 * 汉明的距离
 *
 * @author lwh6a
 * @since 2024/1/21
 */

public class Solution461 {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance2(int x, int y) {
        int s = x ^ y;
        int c = 0;
        while (s != 0){
            c += s & 1;
            s >>= 1;
        }
        return c;
    }
    public int hammingDistance3(int x, int y) {
        int s = x ^ y;
        int c = 0;
        while (s != 0){
            s &= s - 1;
            c++;
        }
        return c;
    }
}
