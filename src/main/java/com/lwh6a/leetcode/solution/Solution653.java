package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;
import lombok.val;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 两数之和IV-输入二叉搜索树
 *
 * @author lwh6a
 * @since 2024/1/30
 */

public class Solution653 {

    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        return dfs(root, k, map);
    }

    public boolean dfs(TreeNode root, int k, Map<Integer, Integer> map){
        if (root == null) {
            return false;
        }
        if (check(root.val, map) || dfs(root.left, k, map) || dfs(root.right, k, map)) {
            return true;
        }
        map.put(k - root.val, root.val);
        return false;
    }

    public boolean check(int val, Map<Integer, Integer> map){
        return map.containsKey(val);
    }
}
