package com.lwh6a.leetcode.utilPoJo;

import lombok.Data;

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

    ListNode(int x) {
        val = x;
        next = null;
    }
}
