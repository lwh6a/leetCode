package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的层平均值
 *
 * @author lwh6a
 * @since 2024/1/30
 */

public class Solution637 {

    public List<Double> averageOfLevels(TreeNode root) {
        return bfs(root);
    }

    public List<Double> bfs(TreeNode root){
        ArrayList<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int i = 0;
            double sum = 0;
            while (i < size){
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                i++;
            }
            res.add(sum /(double) size);
        }

        return res;
    }
}
