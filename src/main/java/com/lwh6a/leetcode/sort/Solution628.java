package com.lwh6a.leetcode.sort;

import java.util.Arrays;

/**
 * @author lwh6a
 * @since 2023/3/28
 */

public class Solution628 {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 1]*nums[len -2]*nums[len-3]);
    }
}
