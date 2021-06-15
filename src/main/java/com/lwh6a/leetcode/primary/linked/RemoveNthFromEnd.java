package com.lwh6a.leetcode.primary.linked;

/**
 * 删除第N个节点
 *
 * @author lwh6a
 * @since 2021/6/15
 */

public class RemoveNthFromEnd {

    public static RListNode removeNthFromEnd(RListNode head, int n) {
        int s = 0;
        RListNode cur = head;
        while (cur != null){
            cur = cur.next;
            s ++;
        }

        int i = s - n;
        if (i == 0) {
            return head.next;
        }
        cur = head;
        for (int j = 1; j < i; j++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    // 双指针
    public static RListNode removeNthFromEnd2(RListNode head, int n) {
        RListNode l = head;
        RListNode r = head;
        for (int i = 0; i < n; i++) {
            r = r.next;
        }
        if (r == null) {
            return head.next;
        }
        while (r != null){
            r = r.next;
            l = l.next;
        }
        l.next = l.next.next;
        return head;

    }

    // 递归
    public static RListNode removeNthFromEnd3(RListNode head, int n) {
        int len = len(head, n);
        if (len == n) {
            return head.next;
        }
        return head;
    }

    private static int len(RListNode r, int n){
        if (r == null) {
            return 0;
        }
        int pos = len(r, n) + 1;
        if (n + 1 == pos) {
            r.next = r.next.next;
        }
        return pos;
    }

    public static void main(String[] args) {
        RListNode rListNode = new RListNode(1);
        RListNode rListNode2 = new RListNode(2);
        rListNode.next = rListNode2;
        RListNode rListNode3 = new RListNode(3);
        rListNode2.next = rListNode3;
        RListNode rListNode4 = new RListNode(4);
        rListNode3.next = rListNode4;
        RListNode rListNode5 = new RListNode(5);
        rListNode4.next = rListNode5;
        RListNode head = removeNthFromEnd(rListNode, 2);

    }
}


class RListNode {
    int val;
    RListNode next;

    RListNode() {
    }

    RListNode(int val) {
        this.val = val;
    }

    RListNode(int val, RListNode next) {
        this.val = val;
        this.next = next;
    }
}