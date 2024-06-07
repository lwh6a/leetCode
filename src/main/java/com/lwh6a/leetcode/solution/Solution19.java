package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.ListNode;

/**
 * 删除链表的倒数第N个节点
 *
 * @author lwh6a
 * @since 2024/6/7
 */

public class Solution19 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        ListNode pre = new ListNode(0, head);
        while (head != null) {
            head = head.next;
            i++;
        }
        int x = 0;
        ListNode cur = pre;
        while (cur != null) {
            x++;
            if (x == i - n + 1) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode1 = new ListNode(1);
        ListNode res = removeNthFromEnd(listNode, 2);
        System.out.println(res);
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 1; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
