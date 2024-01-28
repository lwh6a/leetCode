package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的后序遍历
 *
 * @author lwh6a
 * @since 2024/1/28
 */

public class Solution590 {

    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(Node root, List<Integer> list){
        if (root == null) {
            return;
        }
        for (Node child : root.children) {
            dfs(child, list);
        }
        list.add(root.val);
    }
}
