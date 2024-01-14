package com.lwh6a.leetcode.solution;

/**
 * 区域和检索-数组不可变
 *
 * @author lwh6a
 * @since 2024/1/14
 */

public class Solution303 {

    int[] sums;

    public Solution303(int[] nums) {
        sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
