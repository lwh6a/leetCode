package com.lwh6a.leetcode.solution;

/**
 * 字符串中的单词数
 *
 * @author lwh6a
 * @since 2024/1/19
 */

public class Solution434 {

    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
