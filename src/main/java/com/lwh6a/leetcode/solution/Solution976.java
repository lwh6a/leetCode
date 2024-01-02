package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 * @author lwh6a
 * @since 2023/4/13
 */

public class Solution976 {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
