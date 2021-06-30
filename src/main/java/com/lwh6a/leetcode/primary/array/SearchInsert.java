package com.lwh6a.leetcode.primary.array;

/**
 * 搜索插入位置
 *
 * @author lwh6a
 * @since 2021/6/30
 */

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] || target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
