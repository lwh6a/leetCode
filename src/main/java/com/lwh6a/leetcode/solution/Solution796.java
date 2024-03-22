package com.lwh6a.leetcode.solution;

/**
 * 旋转字符串
 *
 * @author lwh6a
 * @since 2024/3/22
 */

public class Solution796 {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        char g = goal.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == g) {
                String n = s.substring(i) + s.substring(0, i);
                if (n.equals(goal)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String n = s.substring(2) + s.substring(0, 2);
        System.out.println(n);
    }
}
