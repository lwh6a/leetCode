package com.lwh6a.leetcode.solution;

/**
 * 重复的子字符串
 *
 * @author lwh6a
 * @since 2024/1/20
 */

public class Solution459 {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;

    }
}
