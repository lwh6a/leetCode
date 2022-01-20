package com.lwh6a.labuladong.doc;

/**
 * 算法和数据结构的框架思维
 *
 * @author lwh6a
 * @since 2021/4/30
 */

public class Template {

    // 数组遍历
    void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 迭代访问 arr[i]
        }
    }

    // 链表遍历
    void traverse(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            // 迭代访问 p.val
        }
    }

    // 递归访问
    void traverseRecursive(ListNode head) {
        // 业务处理, head.val
        traverseRecursive(head.next);
    }

    // 二叉树遍历, 典型的非线性递归遍历结构
    void traverseTree(TreeNode root) {
        traverseTree(root.left);
        traverseTree(root.right);
    }

    // N叉树遍历
    void traverseTres(TreeNodes root) {
        for (TreeNodes child : root.children) {
            traverseTres(child);
        }
    }

}

class ListNode {
    int val;
    ListNode next;
}

class TreeNode {
    int val;
    TreeNode left, right;
}

// 基本的N叉树节点
class TreeNodes {
    int val;
    TreeNodes[] children;
}