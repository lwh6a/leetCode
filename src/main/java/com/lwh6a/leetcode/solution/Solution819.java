package com.lwh6a.leetcode.solution;

import java.util.*;

/**
 * 最常见的单词
 *
 * @author lwh6a
 * @since 2024/5/12
 */

public class Solution819 {

    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int length = paragraph.length();
        for (int i = 0; i <= length; i++) {
            if (i < length && Character.isLetter(paragraph.charAt(i))) {
                sb.append(Character.toLowerCase(paragraph.charAt(i)));
            } else if (sb.length() > 0) {
                String word = sb.toString();
                map.put(word, map.getOrDefault(word, 0) + 1);
                sb.setLength(0);
            }
        }
        String ans = "";
        int max = -1;
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!set.contains(entry.getKey()) && entry.getValue() > max) {
                ans = entry.getKey();
                max = entry.getValue();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String paragraph =
                "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] arr = {"hit"};
        String s = mostCommonWord(paragraph, arr);
        System.out.println(s);
    }
}
