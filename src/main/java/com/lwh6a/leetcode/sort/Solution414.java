package com.lwh6a.leetcode.sort;

/**
 * 最大的数
 *
 * @author lwh6a
 * @since 2023/3/22
 */

public class Solution414 {

    public static int thirdMax(int[] nums) {
        long fir = Long.MIN_VALUE, sec = Long.MIN_VALUE, third = Long.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int tem = nums[i];
            if (tem > fir) {
                third = sec;
                sec = fir;
                fir = tem;
            }else if (fir > tem && tem > sec) {
                third = sec;
                sec = tem;
            }else if (sec > tem && tem > third) {
                third = tem;
            }
        }
        return (int)(third == Long.MIN_VALUE? fir:third);
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        int i = thirdMax(nums);
        System.out.println(i);
    }
}
