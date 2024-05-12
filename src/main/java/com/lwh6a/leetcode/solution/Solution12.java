package com.lwh6a.leetcode.solution;

/**
 * 整数转罗马数字
 *
 * @author lwh6a
 * @since 2024/5/12
 */

public class Solution12 {

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                stb.append(symbol);
                num -= value;
            }
        }
        return stb.toString();
    }
}
