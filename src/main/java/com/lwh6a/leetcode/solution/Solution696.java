package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 计数二进制子串
 *
 * @author lwh6a
 * @since 2024/2/5
 */

public class Solution696 {

    public int countBinarySubstrings(String s) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            int cnt = 0;
            while (i < s.length() && c == s.charAt(i)){
                i++;
                cnt++;
            }
            list.add(cnt);
        }
        for (int j = 1; j < list.size(); j++) {
            ans += Math.min(list.get(j - 1), list.get(j));
        }
        return ans;
    }

    public int countBinarySubstrings2(String s) {
        int ans = 0, i = 0, pre = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            int cnt = 0;
            while (i < s.length() && c == s.charAt(i)){
                i++;
                cnt++;
            }
            ans += Math.min(pre, cnt);
            pre = cnt;
        }
        return ans;
    }
}
