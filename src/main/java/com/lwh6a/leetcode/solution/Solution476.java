package com.lwh6a.leetcode.solution;

/**
 * 数字的补数
 *
 * @author lwh6a
 * @since 2024/1/21
 */

public class Solution476 {

    public int findComplement(int num) {
        long i = 1;
        while (i <= num){
            i <<= 1;
        }
        return (int)(i -1) ^ num;
    }
}
