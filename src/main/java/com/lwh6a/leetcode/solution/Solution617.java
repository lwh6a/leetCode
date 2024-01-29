package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 合并二叉树
 *
 * @author lwh6a
 * @since 2024/1/29
 */

public class Solution617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(root1, root2);
    }

    public TreeNode dfs(TreeNode root1, TreeNode root2){
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode treeNode = new TreeNode(root1.val + root2.val);
        treeNode.left = dfs(root1.left, root2.left);
        treeNode.right = dfs(root1.right, root2.right);
        return treeNode;
    }
}
