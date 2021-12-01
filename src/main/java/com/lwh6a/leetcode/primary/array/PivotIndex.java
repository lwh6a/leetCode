package com.lwh6a.leetcode.primary.array;

/**
 * 寻找数组的中心索引
 *
 * @author lwh6a
 * @since 2021/6/30
 */

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        if (right == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            right -= nums[i];
            left += nums[i - 1];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
