package com.lwh6a.leetcode.primary.linked;

/**
 * 合并两个有序链表
 *
 * @author lwh6a
 * @since 2021/6/21
 */

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode curr = res;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
       curr.next = l1 ==null? l2:l1;
        return res.next;
    }

    // 递归
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }

    }

    // 递归2
    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 ==null? l2:l1;
        }
        ListNode f = l1.val < l2.val? l1: l2;
        f.next = mergeTwoLists3(f.next, f == l1?l2:l1);
        return f;
    }
}
