package com.lwh6a.leetcode.solution;

/**
 * 七进制数
 *
 * @author lwh6a
 * @since 2024/1/23
 */

public class Solution504 {

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean falg = false;
        if (num < 0) {
            falg = true;
        }
        int absNum = Math.abs(num);
        StringBuilder stb = new StringBuilder();
        while (absNum != 0){
            int mod = absNum % 7;
            stb.append(mod);
            absNum /= 7;
        }
        if (falg) {
            stb.append('-');
        }
        return stb.reverse().toString();
    }
}
