package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电话号码的字母组合
 *
 * @author lwh6a
 * @since 2024/6/6
 */

public class Solution17 {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        append(res, phoneMap, digits, 0, new StringBuilder());
        return res;
    }

    public void append(List<String> res, Map<Character, String> phoneMap, String digits, int idx, StringBuilder stb) {
        if (idx == digits.length()) {
            res.add(stb.toString());
        } else {
            char c = digits.charAt(idx);
            String s = phoneMap.get(c);
            for (int i = 0; i < s.length(); i++) {
                stb.append(s.charAt(i));
                append(res, phoneMap, digits, idx + 1, stb);
                stb.deleteCharAt(idx);
            }
        }
    }
}
