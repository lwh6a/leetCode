package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 完全二叉树的节点个数
 *
 * @author lwh6a
 * @since 2024/1/12
 */

public class Solution222 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
