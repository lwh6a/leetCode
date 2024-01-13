package com.lwh6a.leetcode.solution;
/**
* 各位相加
* @author lwh6a
* @since 2024/1/13
*/

public class Solution258 {

    public int addDigits(int num) {
        while (num >= 10){
            int sum = 0;
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
