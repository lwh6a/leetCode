package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的后序遍历
 *
 * @author lwh6a
 * @since 2024/1/5
 */

public class Solution145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode treeNode = stack1.pop();
            stack2.push(treeNode);
            if (treeNode.left != null) {
                stack1.push(treeNode.left);
            }
            if (treeNode.right != null) {
                stack1.push(treeNode.right);
            }
        }
        while (!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;
    }
}
