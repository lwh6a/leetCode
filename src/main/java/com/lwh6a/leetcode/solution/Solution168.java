package com.lwh6a.leetcode.solution;

/**
 * Excel列表名称
 *
 * @author lwh6a
 * @since 2024/1/6
 */

public class Solution168 {

    public static String convertToTitle(int columnNumber) {
        // AB = 26 * (0 + 1) + 1*(0+1);
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            int cn = columnNumber % 26;
            sb.append((char)('A' + cn));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = convertToTitle(1);
        System.out.println(s);
    }
}
