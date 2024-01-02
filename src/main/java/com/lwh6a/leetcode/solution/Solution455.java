package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 * 分发饼干
 *
 * @author lwh6a
 * @since 2023/3/27
 */

public class Solution455 {


    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; i++,j++) {

            while (j < s.length && g[i] > s[j]){
                j++;
            }
            if (j < s.length) {
                res++;
            }
        }
        return res;
    }
}
