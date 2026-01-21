package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lwh6a
 * @since 2026/1/6
 */

public class Solution784 {

    char[] ca;
    List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        ca = s.toCharArray();
        dfs(0, s.length(), new char[s.length()]);
        return ans;
    }

    public void dfs(int idx, int len, char[] cur) {
        if (idx == len) {
            ans.add(new String(cur));
            return;
        }
        cur[idx] = ca[idx];
        dfs(idx + 1, len, cur);
        if (Character.isLetter(ca[idx])) {
            cur[idx] = (char) (ca[idx] ^ 32);
            dfs(idx + 1, len, cur);
        }
    }
}
