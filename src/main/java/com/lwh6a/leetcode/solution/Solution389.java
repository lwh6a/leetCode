package com.lwh6a.leetcode.solution;

/**
 * 找不同
 *
 * @author lwh6a
 * @since 2023/3/22
 */

public class Solution389 {

    public char findTheDifference(String s, String t) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            res ^= t.charAt(i);
        }
        return (char)res;
    }
}
