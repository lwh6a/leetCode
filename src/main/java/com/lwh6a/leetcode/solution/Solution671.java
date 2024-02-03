package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 二叉树中第二小的节点
 *
 * @author lwh6a
 * @since 2024/2/3
 */

public class Solution671 {

    int min;
    int secondMin;
    public int findSecondMinimumValue(TreeNode root) {
        secondMin = -1;
        min = root.val;
        dfs(root);
        return secondMin;
    }

    public void dfs(TreeNode root){
        if (root == null) {
            return;
        }
        if (secondMin != -1 && root.val >= min) {
            return;
        }
        if (root.val > min) {
            secondMin = root.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
