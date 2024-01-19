package com.lwh6a.leetcode.solution;

/**
 * 字符串相加
 *
 * @author lwh6a
 * @since 2024/1/18
 */

public class Solution415 {

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder stb = new StringBuilder();
        while (i >= 0 || j >= 0 || add !=0){
            int s1 = i >= 0? num1.charAt(i) - '0':0;
            int s2 = j >= 0? num2.charAt(j) - '0':0;
            int rs = s1 + s2 + add;
            stb.append(rs % 10);
            add = rs/10;
            i--;
            j--;
        }
        return stb.reverse().toString();
    }
}
