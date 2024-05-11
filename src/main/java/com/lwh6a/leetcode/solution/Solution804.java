package com.lwh6a.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 唯一的摩斯密码词
 *
 * @author lwh6a
 * @since 2024/5/11
 */

public class Solution804 {

    String[] arr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder stb = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                stb.append(arr[word.charAt(j) - 'a']);
            }
            set.add(stb.toString());
        }
        return set.size();
    }
}
