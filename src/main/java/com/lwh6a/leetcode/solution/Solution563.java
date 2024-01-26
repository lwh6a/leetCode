package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * 二叉树的坡度
 *
 * @author lwh6a
 * @since 2024/1/26
 */

public class Solution563 {
    static int ans = 0;
    public static int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }

    public static int dfs(TreeNode root){
        if (root == null) {
            return 0;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        ans += Math.abs(l - r);
        return l + r + root.val;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int tilt = findTilt(node);
        System.out.println(tilt);
    }
}
