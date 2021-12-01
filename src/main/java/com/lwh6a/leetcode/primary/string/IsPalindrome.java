package com.lwh6a.leetcode.primary.string;

/**
 * 是否是回文字符串
 *
 * @author lwh6a
 * @since 2021/6/28
 */

public class IsPalindrome {


    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome3(String s) {
        String s1 = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String s2 = new StringBuffer(s1).reverse().toString();
        return s.equals(s2);
    }

    public boolean isPalindrome4(String s) {
        return helper(s, 0, s.length() - 1);
    }

    public boolean helper(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        return Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) &&
                helper(s, ++left, --right);
    }
}
