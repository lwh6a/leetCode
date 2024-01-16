package com.lwh6a.leetcode.solution;

/**
 * 判断子序列
 *
 * @author lwh6a
 * @since 2024/1/16
 */

public class Solution392 {

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }else {
                j++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        boolean subsequence = isSubsequence("abc", "ahbgdc");
        System.out.println(subsequence);
    }
}
