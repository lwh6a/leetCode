package com.lwh6a.leetcode.solution;


import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.LinkedList;

/**
 * 对称二叉树
 *
 * @author lwh6a
 * @since 2024/1/2
 */

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right){
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return true;
        }
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }

    public boolean isSymmetric2(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root.left);
        nodes.add(root.right);
        while (!nodes.isEmpty()){
            TreeNode left = nodes.pop();
            TreeNode right = nodes.pop();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            nodes.add(left.left);
            nodes.add(right.right);
            nodes.add(left.right);
            nodes.add(right.left);
        }
        return true;
    }

}
