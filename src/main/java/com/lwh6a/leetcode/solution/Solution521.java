package com.lwh6a.leetcode.solution;

/**
 * 最常特殊序列1
 *
 * @author lwh6a
 * @since 2024/1/24
 */

public class Solution521 {

    public int findLUSlength(String a, String b) {
        return a.equals(b)? -1: Math.max(a.length(), b.length());
    }
}
