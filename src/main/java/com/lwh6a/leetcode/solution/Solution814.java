package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 *
 * @author lwh6a
 * @since 2026/1/30
 */

public class Solution814 {

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left != null || root.right != null) {
            return root;
        }
        return root.val == 0 ? null : root;
    }


    public static void main(String[] args) {
        String s = "SUCCESS1234";
        System.out.println(s.contains("SUCCESS"));

    }
}
