package com.lwh6a.leetcode.solution;

/**
 * 最长连续递增子序列
 *
 * @author lwh6a
 * @since 2024/2/3
 */

public class Solution674 {

    public static int findLengthOfLCIS(int[] nums) {
        int cnt = 0;
        int l = 0, r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums[r]) {
                cnt = Math.max(cnt, r - l + 1);
                l = i;
            }
            r = i;
        }
        cnt = Math.max(cnt, r - l + 1);
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int lengthOfLCIS = findLengthOfLCIS(nums);
        System.out.println(lengthOfLCIS);
    }
}
