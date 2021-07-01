package com.lwh6a.leetcode.primary.array;

/**
 * 寻找旋转数组中的最小值
 *
 * @author lwh6a
 * @since 2021/7/1
 */

public class FindMin {

    public int findMin(int[] nums) {
        int x = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (x < nums[i]) {
                return x;
            }
        }
        return x;
    }
}
