package com.lwh6a.leetcode.primary.linked;

import java.util.Stack;

/**
 * 是否是回文链表
 *
 * @author lwh6a
 * @since 2021/6/22
 */

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
            len ++;
        }

        while (len >= 0) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
            len--;
        }
        return stack.empty();
    }

    // 双链表方式，只比一半
    public boolean isPalindrome2(ListNode head) {
        // 找到中点
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        // 如果s不等与null，则代表链表为奇数个，即向后挪一位，不挪也可以只是把中间的奇数位也进行反转比较
        if (s != null) {
            s = s.next;
        }
        // 反转后半段
        ListNode revers = revers(s);
        // 比较
        while (f != null){
            if (f.val != revers.val) {
                return false;
            }
            f = f.next;
            revers = revers.next;
        }
        return true;
    }

    private ListNode revers(ListNode head){
        ListNode pre = null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    private void reversedPrint(ListNode head){
        if (head == null) {
            return;
        }
        reversedPrint(head.next);
        System.out.println(head.val);
    }

    // 递归
    ListNode tmp;
    public boolean isPalindrome3(ListNode head) {
        tmp = head;
        return check(head);
    }
    public boolean check(ListNode head){
        if (head == null) {
            return true;
        }
        boolean b = check(head.next) && (head.val == tmp.val);
        tmp = tmp.next;
        return b;
    }
}
