package com.lwh6a.leetcode.solution;

/**
 * 反转字符串2
 *
 * @author lwh6a
 * @since 2024/1/25
 */

public class Solution541 {

    public static String reverseStr(String s, int k) {
        StringBuilder stb = new StringBuilder();
        int i = k;
        boolean flag = true;
        while (i < s.length()){
            String sub = s.substring(i - k, i);
            flag = append(stb, flag, sub);
            i += k;
        }
        if (i - k < s.length()) {
            String sub = s.substring(i - k);
            flag = append(stb, flag, sub);
        }
        return stb.toString();
    }

    private static boolean append(StringBuilder stb, boolean flag, String sub) {
        if (flag) {
            StringBuilder builder = new StringBuilder(sub);
            stb.append(builder.reverse());
            flag = false;
        }else {
            stb.append(sub);
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String ans = "bacdfeg";
        String res = reverseStr(s, k);
        System.out.println(res);
        System.out.println(ans.equals(res));
    }
}
