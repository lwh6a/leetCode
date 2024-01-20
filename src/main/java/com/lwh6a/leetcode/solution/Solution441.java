package com.lwh6a.leetcode.solution;

/**
 * 排列硬币
 *
 * @author lwh6a
 * @since 2024/1/19
 */

public class Solution441 {

    public static int arrangeCoins(int n) {
        int i = 1;
        while (n >= i){
            n -= i;
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        int i = arrangeCoins(5);
        System.out.println(i);
    }
}
