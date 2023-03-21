package com.lwh6a.leetcode.other;



/**
 * 代码描述: 删除重复元素
 *
 * @author liuwenhao
 * @date 2021/4/19
 */
public class DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        ListNode curret = head;
        while (curret != null){
            ListNode next = curret.next;
            if (next == null) {
                break;
            }
            if (curret.val == next.val) {
                curret.next = next.next;
            }else {
                curret = next;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode listNode = new ListNode(1, listNode1);

        ListNode listNode3 = deleteDuplicates(listNode);
        System.out.println(listNode3);
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }