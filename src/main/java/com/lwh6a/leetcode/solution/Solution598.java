package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 区间加法2
 *
 * @author lwh6a
 * @since 2024/1/28
 */

public class Solution598 {

    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m*n;
        }
        int x = m;
        int y = n;
        for (int[] op : ops) {
            x = Math.min(op[0], x);
            y = Math.min(op[1], y);
        }
        return x*y;
    }

    public static void main(String[] args) {
        int m = 39999;
        int n = 39999;
        int[][] ops = {{19999,19999}};
        int i = maxCount(m, n, ops);
        System.out.println(i);
    }
}
