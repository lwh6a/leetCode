package com.lwh6a.leetcode.other;

/**
 * 消失的数字
 *
 * @author lwh6a
 * @since 2023/3/22
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumMiss = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum += i;
            sumMiss += nums[i];
        }
        sum += nums.length;
        return sum - sumMiss;
    }
}
