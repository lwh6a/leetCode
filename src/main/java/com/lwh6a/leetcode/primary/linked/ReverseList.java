package com.lwh6a.leetcode.primary.linked;

import java.util.Stack;

/**
 * 链表反转
 *
 * @author lwh6a
 * @since 2021/6/21
 */

public class ReverseList {

    public static RsListNode reverseList(RsListNode head) {
        if (head == null) {
            return null;
        }
        RsListNode node = new RsListNode();
        rs(node, head);
        return node.next;
    }

    private static void rs(RsListNode base, RsListNode curr){
        if (curr.next == null) {
            base.next = curr;
            return;
        }
        RsListNode next = curr.next;
        rs(base, next);
        next.next = curr;
        curr.next = null;
    }

    // 栈方式
    public static RsListNode reverseList2(RsListNode head) {
        Stack<RsListNode> rsListNodes = new Stack<>();
        RsListNode curr = head;
        while (curr != null){
            rsListNodes.push(curr);
            curr = curr.next;
        }
        if (rsListNodes.isEmpty()) {
            return null;
        }
        RsListNode node = rsListNodes.pop();
        RsListNode next = node;
        while (!rsListNodes.empty()){
            RsListNode pop = rsListNodes.pop();
            next.next = pop;
            next = pop;
        }
        next.next = null;
        return node;
    }

    // 双链表
    public static RsListNode reverseList3(RsListNode head) {
        RsListNode node = null;
        while (head != null){
            // 获取下个节点
            RsListNode next = head.next;
            // 新链表插入头节点
            head.next = node;
            node = head;
            // 原节点删除头节点
            head = next;
        }
        return node;
    }

    public static void main(String[] args) {
        RsListNode rsListNode = new RsListNode(1, new RsListNode(2));
        RsListNode res = reverseList(rsListNode);
        System.out.println("-----" + res);
    }
}

class RsListNode {
    int val;
    RsListNode next;
    RsListNode() {}
    RsListNode(int val) { this.val = val; }
    RsListNode(int val, RsListNode next) { this.val = val; this.next = next; }
 }