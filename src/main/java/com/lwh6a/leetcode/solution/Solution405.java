package com.lwh6a.leetcode.solution;

/**
 * 数字转换为十六进制
 *
 * @author lwh6a
 * @since 2024/1/17
 */

public class Solution405 {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder stb = new StringBuilder();
        while (num != 0){
            int sub = num & 15;
            char u = (char) (sub + '0');
            if (sub >= 10) {
                u = (char)(sub - 10 + 'a');
            }
            stb.append(u);
            num >>>= 4;
        }
        return stb.reverse().toString();
    }
}
