package com.lwh6a.leetcode.primary.linked;

import java.util.HashSet;

/**
 * 是否有环形链表
 *
 * @author lwh6a
 * @since 2021/6/25
 */

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        // 快慢指针，如果快慢指针相遇则代表有环，不是必须在环的点相遇而是在环上任何点相遇都可以
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null) {
            // 慢指针每次走一步
            slow = slow.next;
            // 快指针每次走两步
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // 集合
    public boolean hasCycle2(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    // 删除节点
    public boolean hasCycle3(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        if (head == head.next) {
            return true;
        }
        ListNode next = head.next;
        head.next = head;
        return hasCycle3(next);
    }

    // 反转比较
    public boolean hasCycle4(ListNode head) {
        ListNode pre = reverseListNode(head);
        if (head != null && head.next != null && head == pre) {
            return true;
        }
        return false;
    }

    public ListNode reverseListNode(ListNode head) {
        ListNode newNode = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        return newNode;
    }
}
