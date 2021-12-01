package com.lwh6a.leetcode.primary.array;

/**
 * 加一
 *
 * @author lwh6a
 * @since 2021/5/12
 */

public class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                // 只加一
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}
