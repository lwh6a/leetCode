package com.lwh6a.leetcode.solution;

/**
 * 写字符串需要的行数
 *
 * @author lwh6a
 * @since 2024/5/11
 */

public class Solution806 {

    public int[] numberOfLines(int[] widths, String s) {
        int[] res = {1, 0};
        for (int i = 0; i < s.length(); i++) {
            int width = widths[s.charAt(i) - 'a'];
            if (res[1] + width > 100) {
                res[0]++;
                res[1] = width;
            } else {
                res[1] += width;
            }
        }
        return res;
    }
}
