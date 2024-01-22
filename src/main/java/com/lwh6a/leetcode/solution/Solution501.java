package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树中的众数
 *
 * @author lwh6a
 * @since 2024/1/22
 */

public class Solution501 {

    List<Integer> ans = new ArrayList<>();
    int base = 0, count = 0, maxCount = 0;

    public int[] findMode(TreeNode root) {
        inorder(root);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public void inorder(TreeNode root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        update(root.val);
        inorder(root.right);
    }

    public void update(int val){
        if (val == base) {
            count++;
        }else {
            base = val;
            count = 1;
        }
        if (count == maxCount) {
            ans.add(base);
        }else if (count > maxCount) {
            maxCount = count;
            ans.clear();
            ans.add(base);
        }
    }

}
