package com.lwh6a.leetcode.other;

/**
 * 多数元素
 *
 * @author lwh6a
 * @since 2023/3/22
 */

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == maj) {
                count++;
            }else {
                count--;
                if (count == 0) {
                    maj = nums[i];
                    count = 1;
                }
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
