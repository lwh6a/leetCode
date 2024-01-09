package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.ListNode;

/**
 * 移除链表元素
 *
 * @author lwh6a
 * @since 2024/1/9
 */

public class Solution203 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0, head);
        ListNode curr = pre;
        while (curr.next != null){
            ListNode next = curr.next;
            if (next.val == val) {
                curr.next = next.next;
            }else {
                curr = curr.next;
            }
        }
        return pre.next;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,7,7};

    }
}
