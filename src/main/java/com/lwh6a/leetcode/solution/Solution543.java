package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 二叉树的直径
 *
 * @author lwh6a
 * @since 2024/1/25
 */

public class Solution543 {

    int max;

    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (right+left > max) {
            max = right + left;
        }
        return Math.max(left, right) + 1;
    }
}
