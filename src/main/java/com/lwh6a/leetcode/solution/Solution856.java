package com.lwh6a.leetcode.solution;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author lwh6a
 * @since 2026/3/20
 */

public class Solution856 {

    public int scoreOfParentheses(String s) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                deque.addLast(0);
            } else {
                int curr = deque.pollLast();
                deque.addLast(deque.pollLast() + Math.max(curr * 2, 1));
            }
        }
        return deque.pollLast();
    }
}
