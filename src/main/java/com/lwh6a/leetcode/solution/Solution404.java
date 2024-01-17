package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.LinkedList;

/**
 * 左叶子之和
 *
 * @author lwh6a
 * @since 2024/1/17
 */

public class Solution404 {

    public int sumOfLeftLeaves(TreeNode root) {
        return root == null? 0:dfs(root);
    }

    public int dfs(TreeNode node){
        int ans = 0;
        if (node.left != null) {
            ans += isLeave(node.left)? node.left.val:dfs(node.left);
        }
        if (node.right != null && !isLeave(node.right)) {
            ans += dfs(node.right);
        }
        return ans;
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            if (poll.left != null) {
                if (isLeave(poll.left)) {
                    ans += poll.left.val;
                }else {
                    queue.offer(poll.left);
                }
            }
            if (poll.right != null && !isLeave(poll.right)) {
                queue.offer(poll.right);
            }
        }
        return ans;
    }

    public boolean isLeave(TreeNode node){
        return node.left == null && node.right == null;
    }
}
