package com.lwh6a.leetcode.other;


/**
 *   是否是相同的树
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }else if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            };
            return isSameTree(p.left, q.left) && isSameTree(p.right, p.right);
        }else {
            return false;
        }
    }
}



// Definition for a binary tree node.
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}
