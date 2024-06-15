package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.ListNode;

/**
 * 两两交换链表中的节点
 *
 * @author lwh6a
 * @since 2024/6/15
 */

public class Solution24 {

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next != null && pre.next.next != null) {
            ListNode first = pre.next;
            ListNode second = pre.next.next;
            first.next = second.next;
            second.next = first;
            pre.next = second;
            pre = first;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head = swapPairs(listNode);
        while (head != null) {
            System.out.print(head.val + " ");
        }
    }
}
