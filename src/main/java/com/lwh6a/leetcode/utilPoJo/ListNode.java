package com.lwh6a.leetcode.utilPoJo;

/**
 * 链表
 *
 * @author lwh6a
 * @since 2024/1/5
 */
//@Data
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(ListNode next) {
        this.next = next;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
