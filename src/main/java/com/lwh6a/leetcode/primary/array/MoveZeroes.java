package com.lwh6a.leetcode.primary.array;

/**
 * 移动零
 *
 * @author <a href="mailto:liuwenhao@fenxiangbuy.com">刘文豪</a>
 * @since 2021/5/13
 */

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[l++] = nums[i];
            }
        }
        while (l < nums.length){
            nums[l++] = 0;
        }
    }

    public void moveZeroes2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j ++;
            }else if (nums[i] != 0) {
                nums[i - j] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public void moveZeroes3(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }

    }

}
