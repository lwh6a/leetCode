package com.lwh6a.leetcode.other;

/**
 * @author lwh6a
 * @since 2023/3/20
 */

public class MySqrt {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (right - left > 1){
            int m = (right + left) /2;
            if (x/m < m) {
                right = m;
            }else {
                left = m;
            }
        }
        return left;
    }
}
