package com.lwh6a.leetcode.solution;

import java.util.Stack;

/**
 * 代码描述: leetcode第20题
 *
 * @author liuwenhao
 * @since 2020/7/17 11:20
 */

public class Solution20Stack {

    private Stack in = new Stack();
    private Stack out = new Stack();

    public <T> void push(T data) {
        in.push(data);
    }

    public <T> T pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return (T) out.pop();
    }

    public void peek() {

    }
}
