package com.lwh6a.leetcode.solution;

/**
 * 转换成小写字母
 *
 * @author lwh6a
 * @since 2024/2/25
 */

public class Solution709 {

    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c |= 32;
            }
            stb.append(c);
        }
        return stb.toString();
    }
}
