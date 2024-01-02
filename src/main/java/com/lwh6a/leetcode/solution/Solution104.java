package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树的最大深度
 * @author lwh6a
 * @since 2024/1/2
 */

public class Solution104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> nodes = new LinkedList<>();
        int ans = 0;
        nodes.offer(root);
        while (!nodes.isEmpty()){
            int size = nodes.size();
            while (size > 0){
                TreeNode element = nodes.element();
                if (element.left != null) {
                    nodes.add(element.left);
                }
                if (element.right != null) {
                    nodes.add(element.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }

}
