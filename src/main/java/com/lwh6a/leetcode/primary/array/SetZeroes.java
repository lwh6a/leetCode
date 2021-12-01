package com.lwh6a.leetcode.primary.array;

import org.apache.logging.log4j.util.Strings;

/**
 * 零矩阵
 *
 * @author lwh6a
 * @since 2021/7/1
 */

public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        boolean[] r = new boolean[matrix.length];
        boolean[] c = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int[] in = matrix[i];
            for (int j = 0; j < in.length; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] in = matrix[i];
            for (int j = 0; j < in.length; j++) {
                if (r[i] || c[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static String makeFancyString(String s) {
        int len = s.length();
        if (len <= 2) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        res.append(s, 0, 2);
        for (int i = 2; i < len; i++) {
            char c = s.charAt(i);
            int resLen = res.length();
            if (c == res.charAt(resLen - 1) && c == res.charAt(resLen - 2)) {
                continue;
            }
            res.append(c);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "leeetcode";
        String s1 = makeFancyString(s);
        System.out.println(s1);
    }
}
