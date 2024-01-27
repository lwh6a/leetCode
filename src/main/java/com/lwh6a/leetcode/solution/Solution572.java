package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 另一颗树的子树
 *
 * @author lwh6a
 * @since 2024/1/27
 */

public class Solution572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }

    public boolean dfs(TreeNode root, TreeNode subRoot){
        if (root == null) {
            return false;
        }
        return check(root, subRoot) || dfs(root.left, subRoot) || dfs(root.right, subRoot);
    }

    public boolean check(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null || root.val != subRoot.val) {
            return false;
        }
        return check(root.left, subRoot.left) && check(root.right, subRoot.right);
    }
}
