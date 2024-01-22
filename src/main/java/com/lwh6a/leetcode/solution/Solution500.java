package com.lwh6a.leetcode.solution;

import java.util.ArrayList;

/**
 * 键盘行
 *
 * @author lwh6a
 * @since 2024/1/22
 */

public class Solution500 {

    public String[] findWords(String[] words) {
        String rowIdx = "12210111011122000010020202";
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            char idxc = rowIdx.charAt(Character.toLowerCase(word.charAt(0)) - 'a');
            boolean flag = true;
            for (int i = 1; i < word.length(); i++) {
                if (idxc != rowIdx.charAt(Character.toLowerCase(word.charAt(i)) - 'a')) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
