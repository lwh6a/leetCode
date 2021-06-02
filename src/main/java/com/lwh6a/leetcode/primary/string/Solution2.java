package com.lwh6a.leetcode.primary.string;

import java.util.Arrays;

/**
 * 代码描述: 移动零
 *
 * @author liuwenhao
 * @since 2020/4/20 15:27
 */

public class Solution2 {

    public static void moveZeroes(int[] nums) {
        int head = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // 不等于0则向前移动
            if (nums[i] != 0) {
                nums[head] = nums[i];
                if (i != head) {
                    nums[i] = 0;
                }
                head ++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
