package com.lwh6a.leetcode.sort;

import java.util.Arrays;

/**
 * @author lwh6a
 * @since 2023/3/29
 */

public class Solution922 {

    public static int[] sortArrayByParityII(int[] nums) {
        int pre = 1;
        for (int i = 0; i < nums.length; i+=2) {
            if (nums[i]%2 == 1) {
                while (nums[pre]%2 == 1){
                    pre+=2;
                }
                int tmp = nums[pre];
                nums[pre] = nums[i];
                nums[i] = tmp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {2,3};
        int[] ints = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(ints));
    }
}
