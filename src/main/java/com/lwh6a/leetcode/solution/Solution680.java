package com.lwh6a.leetcode.solution;

/**
 * 验证回文串2
 *
 * @author lwh6a
 * @since 2024/2/3
 */

public class Solution680 {
    static int c = 1;
    public static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r){
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }else {
                if (c > 0) {
                    c--;
                    return validPalindrome(s.substring(l, r)) || validPalindrome(s.substring(l + 1, r + 1));
                }
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        boolean b = validPalindrome(s);
        System.out.println(b);
    }
}
