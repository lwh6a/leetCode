package com.lwh6a.leetcode.solution;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 简化路径
 *
 * @author lwh6a
 * @since 2025/2/15
 */

public class Solution71 {

    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : split) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else if (!s.isEmpty() && !s.equals(".")) {
                stack.offerLast(s);
            }
        }
        StringBuilder builder = new StringBuilder();
        if (stack.isEmpty()) {
            builder.append("/");
        } else {
            while (!stack.isEmpty()) {
                builder.append("/");
                builder.append(stack.pollFirst());
            }
        }
        return builder.toString();
    }
}
