package com.lwh6a.leetcode.solution;

/**
 * 比特与2比特字符
 *
 * @author lwh6a
 * @since 2024/2/25
 */

public class Solution717 {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1){
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
