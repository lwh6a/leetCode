package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 平衡二叉树
 *
 * @author lwh6a
 * @since 2024/1/3
 */

public class Solution110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height((root.right))) <= 1 &&
                isBalanced(root.left) && isBalanced((root.right));
    }

    public int height(TreeNode root){
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isBalanced2(TreeNode root) {
        if (root == null) {
            return true;
        }
        return height2(root) > 0;
    }

    public int height2(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftHeight = height2((root.left));
        int rightHeight = height2(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
