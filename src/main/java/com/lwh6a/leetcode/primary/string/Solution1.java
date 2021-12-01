package com.lwh6a.leetcode.primary.string;

/**
 * 应用模块名称:
 * 代码描述:
 *
 * @author Gemin
 * @since 2020/4/8 10:48
 */

public class Solution1 {

    public static int removeDuplicates(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[res]) {
                res++;
                nums[res] = nums[i];
            }
        }

        return res + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = removeDuplicates(nums);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
