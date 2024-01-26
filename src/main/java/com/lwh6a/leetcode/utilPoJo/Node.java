package com.lwh6a.leetcode.utilPoJo;

import java.util.List;

/**
 * leetcode  N叉树实体类
 *
 * @author lwh6a
 * @since 2024/1/26
 */
// Definition for a Node.
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

