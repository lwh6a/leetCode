package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.LinkedList;

/**
 * 翻转二叉树
 *
 * @author lwh6a
 * @since 2024/1/12
 */

public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (left != null) {
                queue.offer(left);
            }
            if (root.right != null) {
                queue.offer(root.right);
            }
        }
        return root;
    }
}
