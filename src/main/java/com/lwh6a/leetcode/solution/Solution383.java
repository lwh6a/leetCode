package com.lwh6a.leetcode.solution;

/**
 * 赎金信
 *
 * @author lwh6a
 * @since 2024/1/16
 */

public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] charCounts = new int[26];
        for (char c : magazine.toCharArray()) {
            int i = c - 'a';
            charCounts[i]++;
        }
        for (char c : ransomNote.toCharArray()) {
            int i = c - 'a';
            charCounts[i]--;
            if (charCounts[i] < 0) {
                return false;
            }
        }
        return true;
    }


}
