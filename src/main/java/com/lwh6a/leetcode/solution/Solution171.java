package com.lwh6a.leetcode.solution;

/**
 * Excel列表序号
 *
 * @author lwh6a
 * @since 2024/1/6
 */

public class Solution171 {

    public int titleToNumber(String columnTitle) {
        // AB=28
        int ans = 0;
        for (char c : columnTitle.toCharArray()) {
            int i = c - 'A' + 1;
            ans = ans * 26 + i;
        }
        return ans;
    }
}
