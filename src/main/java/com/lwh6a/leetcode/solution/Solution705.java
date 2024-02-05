package com.lwh6a.leetcode.solution;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 设计哈希集合
 *
 * @author lwh6a
 * @since 2024/2/5
 */

public class Solution705 {

    private static final int base = 769;
    private LinkedList[] data;

    public Solution705() {
        data = new LinkedList[base];
        for (int i = 0; i < base; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int hash = hash(key);
        LinkedList datum = data[hash];
        Iterator<Integer> iterator = data[hash].iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(key)) {
                return;
            }
        }
        datum.offerLast(key);
    }

    public void remove(int key) {
        int hash = hash(key);
        Iterator<Integer> iterator = data[hash].iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(key)) {
                data[hash].remove(next);
            }
        }
    }

    public boolean contains(int key) {
        int hash = hash(key);
        LinkedList datum = data[hash];
        for (Object o : datum) {
            if (o.equals(key)) {
                return true;
            }
        }
        return false;
    }

    private int hash(int key){
        return key % base;
    }
}
