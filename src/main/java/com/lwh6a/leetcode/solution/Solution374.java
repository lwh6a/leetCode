package com.lwh6a.leetcode.solution;

/**
 * 猜数字大小
 *
 * @author lwh6a
 * @since 2024/1/15
 */

public class Solution374 {

    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int guess = guess(mid);
            if (guess <= 0) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int guess(int num){
        return 0;
    }
}
