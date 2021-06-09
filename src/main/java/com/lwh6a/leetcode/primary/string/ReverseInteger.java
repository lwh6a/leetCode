package com.lwh6a.leetcode.primary.string;

/**
 * 反转整数
 *
 * @author lwh6a
 * @since 2021/6/9
 */

public class ReverseInteger {

    public int reverse(int x) {
        int res = 0;
        while (x != 0){
            int t = x % 10;
            int n = res * 10 + t;
            if ((n - t) /10 != res) {
                return 0;
            }
            res = n;
            x = x /10;
        }
        return res;
    }

    public int reverse2(int x) {
        long res = 0;
        while (x != 0){
            res = res * 10 + x %10;
            x = x /10;
        }
        return (int)res == res? (int)res:0;
    }
}
