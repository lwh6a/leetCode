package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 二叉搜索树节点最小距离
 *
 * @author lwh6a
 * @since 2024/3/22
 */

public class Solution783 {

    int ans = Integer.MAX_VALUE;
    int pre = -1;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }
}
