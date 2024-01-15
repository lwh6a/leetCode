package com.lwh6a.leetcode.solution;

/**
 * 有效的完全平方数
 *
 * @author lwh6a
 * @since 2024/1/15
 */

public class Solution367 {

    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square < num) {
                left = mid + 1;
            }else if (square > num) {
                right = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
