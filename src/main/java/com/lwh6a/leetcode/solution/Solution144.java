package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 *
 * @author lwh6a
 * @since 2024/1/5
 */

public class Solution144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        traversal(root, list);
        return list;
    }
    public void traversal(TreeNode root, List<Integer> list){
        if (root == null) {
            return;
        }
        list.add(root.val);
        traversal(root.left, list);
        traversal(root.right, list);
    }

}
