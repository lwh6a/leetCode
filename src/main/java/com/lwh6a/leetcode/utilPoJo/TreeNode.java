package com.lwh6a.leetcode.utilPoJo;

import lombok.val;

/**
 * 树工具类
 *
 * @author lwh6a
 * @since 2024/1/2
 */

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
