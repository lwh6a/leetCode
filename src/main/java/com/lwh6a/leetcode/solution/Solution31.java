package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 * 下一个排列
 *
 * @author lwh6a
 * @since 2024/6/17
 */

public class Solution31 {

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int c = nums.length - 1, k = nums.length - 1;
        int p = nums.length - 2;
        while (p >= 0 && nums[p] >= nums[c]) {
            c--;
            p--;
        }
        // 123456
        if (p >= 0) {
            while (nums[p] >= nums[k]) {
                k--;
            }
            int tmp = nums[p];
            nums[p] = nums[k];
            nums[k] = tmp;
        }
        Arrays.sort(nums, p + 1, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        nextPermutation(nums);
    }
}
