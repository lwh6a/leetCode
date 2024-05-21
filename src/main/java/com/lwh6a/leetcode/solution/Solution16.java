package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 * 最接近的三数之和
 *
 * @author lwh6a
 * @since 2024/5/21
 */

public class Solution16 {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int ans = 1000000;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                int m = nums[i] + nums[j] + nums[k];
                if (Math.abs(m - target) < Math.abs(ans - target)) {
                    ans = m;
                }

                if (m > target) {
                    k--;
                } else if (m < target) {
                    j++;
                } else {
                    return m;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int i = threeSumClosest(nums, 1);
        System.out.println(i);
    }
}
