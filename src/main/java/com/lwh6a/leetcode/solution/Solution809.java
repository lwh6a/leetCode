package com.lwh6a.leetcode.solution;

/**
 *
 * @author lwh6a
 * @since 2026/1/27
 */

public class Solution809 {

    public int expressiveWords(String s, String[] words) {
        int n = s.length(), ans = 0;
        out:
        for (String word : words) {
            int m = word.length(), i = 0, j = 0;
            while (i < n && j < m) {
                if (s.charAt(i) != word.charAt(j)) continue out;
                int a = i, b = j;
                while (a < n && s.charAt(a) == s.charAt(i)) a++;
                while (b < m && word.charAt(b) == word.charAt(j)) b++;
                a -= i;
                b -= j;
                if (a != b && (b > a || a < 3)) continue out;
                i += a;
                j += b;
            }
            if (i == n && j == m) ans++;
        }
        return ans;

    }

    public static void main(String[] args) {
        Solution809 solution809 = new Solution809();
        int heeellooo = solution809.expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"});
        System.out.println(heeellooo);
    }
}
