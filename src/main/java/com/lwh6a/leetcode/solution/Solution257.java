package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @author lwh6a
 * @since 2024/1/12
 */

public class Solution257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        concatPath(root, "", list);
        return list;
    }

    public void concatPath(TreeNode root, String path, List<String> list){
        if (root == null) {
            return;
        }
        StringBuilder builder = new StringBuilder(path);
        builder.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(builder.toString());
        }else {
            builder.append("->");
            concatPath(root.left, builder.toString(), list);
            concatPath(root.right, builder.toString(), list);
        }
    }
}
