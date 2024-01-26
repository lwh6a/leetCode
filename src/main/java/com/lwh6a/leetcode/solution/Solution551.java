package com.lwh6a.leetcode.solution;

/**
 * 学生考勤记录
 *
 * @author lwh6a
 * @since 2024/1/26
 */

public class Solution551 {

    public static boolean checkRecord(String s) {
        int a = 0;
        int l1 = 0;
        int l2 = 0;
        int max = Integer.MIN_VALUE;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L') {
                l2++;
                max = Math.max(max, l2 - l1);
            }else {
                if (chars[i] == 'A') {
                    a++;
                }
                l1 = i;
                l2 = i;
            }
        }

        return a < 2 && max < 3;
    }

    public static void main(String[] args) {
        String s = "PPALLL";
        boolean b = checkRecord(s);
        System.out.println(b);
    }
}
