package com.lwh6a.leetcode.sort;

/**
 * @author lwh6a
 * @since 2023/3/29
 */

public class Solution905 {

    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 ==0) {
                res[l] = nums[i];
                l++;
            }else {
                res[r] = nums[i];
                r--;
            }
        }
        return res;
    }
}
