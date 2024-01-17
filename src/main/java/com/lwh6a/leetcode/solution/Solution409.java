package com.lwh6a.leetcode.solution;

/**
 * 最长回文串
 *
 * @author lwh6a
 * @since 2024/1/17
 */

public class Solution409 {

    public int longestPalindrome(String s) {
        int[] askC = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            askC[c]++;
        }
        int count = 0;
        for (int i : askC) {
            count += i/2*2;
            if (count % 2 == 0 && i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
