package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 *
 * @author lwh6a
 * @since 2024/6/7
 */

public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans, 0, n, new StringBuilder());
        return ans;
    }

    public void backTrack(List<String> ans, int idx, int n, StringBuilder sb) {

    }
}
