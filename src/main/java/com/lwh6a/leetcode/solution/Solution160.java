package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.ListNode;

import java.util.HashSet;

/**
 * 相交链表
 *
 * @author lwh6a
 * @since 2024/1/5
 */

public class Solution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb){
            pa = pa == null? headB:pa.next;
            pb = pb == null? headA:pb.next;
        }
        return pa;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != null){
            set.add(pa);
            pa = pa.next;
        }
        while (pb != null){
            if (set.contains(pb)) {
                return pb;
            }
            pb = pb.next;
        }
        return null;
    }
}
