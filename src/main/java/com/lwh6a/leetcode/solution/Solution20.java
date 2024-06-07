package com.lwh6a.leetcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效的括号
 *
 * @author lwh6a
 * @since 2024/6/7
 */

public class Solution20 {

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!map.get(c).equals(top)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
}
