package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.Node;

import java.util.LinkedList;

/**
 * N叉树的最大深度
 *
 * @author lwh6a
 * @since 2024/1/26
 */

public class Solution559 {

    public int maxDepth(Node root) {
        return dfs(root);
    }

    public int dfs(Node root){
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node child : root.children) {
            int dfs = dfs(child);
            max = Math.max(max, dfs);
        }
        return max + 1;
    }
    public int bfs(Node root){
        if (root == null) {
            return 0;
        }
        int ans = 0;
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                Node node = queue.poll();
                for (Node child : node.children) {
                    queue.offer(child);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}
