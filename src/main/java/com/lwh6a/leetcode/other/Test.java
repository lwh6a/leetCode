package com.lwh6a.leetcode.other;

/**
 * @author lwh6a
 * @since 2023/3/28
 */

public class Test {

    public int test(Integer target, int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l <= r){
            int mid = (r - l)/2 + l;
            if (target < nums[mid]) {
                r = mid;
            }else if (target > nums[mid]) {
                l = mid;
            }else {
                return nums[mid];
            }
        }
        return  0;

    }
}
