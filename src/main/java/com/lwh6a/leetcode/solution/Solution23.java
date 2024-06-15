package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.ListNode;

/**
 * 合并K个升序链表
 *
 * @author lwh6a
 * @since 2024/6/12
 */

public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (int i = 0; i < lists.length; i++) {
            ListNode list = lists[i];
            ans = mergeTwoKlists(ans, list);
        }
        return ans;
    }

    public ListNode mergeTwoKlists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            } else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            cur.next = list1;
        }
        if (list2 != null) {
            cur.next = list2;
        }
        return pre.next;
    }
}
