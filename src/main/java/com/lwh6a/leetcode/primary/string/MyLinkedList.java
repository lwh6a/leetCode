package com.lwh6a.leetcode.primary.string;

import lombok.Data;

/**
 * 代码描述: 自定义链表
 *
 * @author liuwenhao
 * @since 2020/4/21 14:28
 */

public class MyLinkedList {

    private Node<Integer> head;
    private int size;

    @Data
    private static class Node<T> {
        private T val;
        private Node<T> next;
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        head = new Node<Integer>();
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index > size) {
            return -1;
        }
        Node<Integer> cur = head;
        int idx = 0;
        while (cur.next != null) {
            cur = head.next;
            idx++;
            if (idx == index) {
                return cur.getVal();
            }
        }
        return 0;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node<Integer> cur = new Node<>();
        cur.setVal(val);
        cur.setNext(head);
        head = cur;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node<Integer> cur = head;
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }
        Node<Integer> node = new Node<>();
        node.setVal(val);
        cur.setNext(node);
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        }
        if (index == size) {
            addAtTail(val);
        }
        if (index < size) {
            Node<Integer> cur = head;
            while (index > 0) {
                index--;
                cur = cur.getNext();
            }
            Node<Integer> node = new Node<>();
            node.setVal(val);
            node.setNext(cur.getNext());
            cur.setNext(node);
        }

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0 || index < size) {
            Node<Integer> cur = head;
            while (index > 0) {
                index--;
                cur = cur.getNext();
            }
            cur.setNext(cur.getNext());
        }
    }
}
