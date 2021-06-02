package com.lwh6a.leetcode.primary.array;

/**
 * 只出现一次的数字
 *
 * @author <a href="mailto:liuwenhao@fenxiangbuy.com">刘文豪</a>
 * @since 2021/5/12
 */

public class SingleNumber {

    // 使用异或运算，将所有值进行异或
    //异或运算，相异为真，相同为假，所以 a^a = 0 ;0^a = a
    //因为异或运算 满足交换律 a^b^a = a^a^b = b 所以数组经过异或运算，单独的值就剩下了
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x ^= nums[i];
        }
        return x;
    }
}
