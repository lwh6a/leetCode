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
        backTrack(ans, 0, 0, n, new StringBuilder());
        return ans;
    }

    public void backTrack(List<String> ans, int open, int close, int n, StringBuilder sb) {
        if (sb.length() == n * 2) {
            ans.add(sb.toString());
            return;
        }
        if (open < n) {
            sb.append("(");
            backTrack(ans, open + 1, close, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            backTrack(ans, open, close + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
