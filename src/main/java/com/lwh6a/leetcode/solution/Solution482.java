package com.lwh6a.leetcode.solution;

/**
 * 密钥格式化
 *
 * @author lwh6a
 * @since 2024/1/21
 */

public class Solution482 {

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder stb = new StringBuilder();
        char[] chars = s.toCharArray();
        int c = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != '-') {
                c++;
                stb.append(chars[i]);
                if (c % k == 0) {
                    stb.append('-');
                }
            }
        }
        if (stb.length() > 0 && stb.charAt(stb.length() - 1) == '-') {
            stb.deleteCharAt(stb.length() - 1);
        }
        return stb.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        String s = "--a-a-a-a--";
        String s1 = licenseKeyFormatting(s, 2);
        System.out.println(s1);
    }
}
