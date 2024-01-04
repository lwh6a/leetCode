package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.LinkedList;

/**
 * 路径总和
 *
 * @author lwh6a
 * @since 2024/1/4
 */

public class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        LinkedList<Integer> integers = new LinkedList<>();
        treeNodes.offer(root);
        integers.offer(root.val);
        while (!treeNodes.isEmpty()){
            TreeNode node = treeNodes.poll();
            int val = integers.poll();
            if (node.left == null && node.right == null) {
                if (targetSum == val) {
                    return true;
                }
                continue;
            }
            if (node.left != null) {
                treeNodes.offer(node.left);
                integers.offer(val + node.left.val);
            }
            if (node.right != null) {
                treeNodes.offer(node.right);
                integers.offer(val + node.right.val);
            }
        }
        return false;
    }

    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum2(root.left, targetSum - root.val)
                && hasPathSum2(root.right, targetSum - root.val);
    }
}
