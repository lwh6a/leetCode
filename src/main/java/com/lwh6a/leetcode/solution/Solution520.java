package com.lwh6a.leetcode.solution;

/**
 * 检测大写自母
 *
 * @author lwh6a
 * @since 2024/1/24
 */

public class Solution520 {

    public static boolean detectCapitalUse(String word) {
        if (word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            return false;
        }
        for (int i = 2; i < word.length(); i++) {
            boolean detct = Character.isUpperCase(word.charAt(i));
            if (detct != Character.isUpperCase(word.charAt(1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "USA";
        boolean capitalUse = detectCapitalUse(s);
        System.out.println(capitalUse);
    }
}
