package com.lwh6a.leetcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 单词的规律
 *
 * @author lwh6a
 * @since 2024/1/14
 */

public class Solution290 {

    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(arr[i], i))) {
                return false;
            }
        }
        return true;
    }
}
