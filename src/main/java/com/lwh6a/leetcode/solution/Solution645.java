package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 * 错误的集合
 *
 * @author lwh6a
 * @since 2023/3/28
 */

public class Solution645 {

    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pre == nums[i]) {
                res[0] = nums[i];
            }else if (nums[i] - pre > 1) {
                res[1] = nums[i] - 1;
            }
            pre = nums[i];
        }
        if (nums[nums.length - 1] != nums.length) {
            res[1] = nums.length;
        }

        return res;
    }
}
