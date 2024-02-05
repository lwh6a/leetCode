package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 二叉搜索树中的搜索
 *
 * @author lwh6a
 * @since 2024/2/5
 */

public class Solution700 {

    public TreeNode searchBST(TreeNode root, int val) {
        return dfs(root, val);
    }

    public TreeNode dfs(TreeNode root, int val){
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        return val < root.val? dfs(root.left, val):dfs(root.right, val);
    }
}
