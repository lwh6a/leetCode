package com.lwh6a.leetcode.solution;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/**
 * 设计哈希映射
 *
 * @author lwh6a
 * @since 2024/2/25
 */

public class Solution706 {
    private static final int base = 769;
    private LinkedList[] data;
    public Solution706() {
        data = new LinkedList[base];
        for (int i = 0; i < base; i++) {
            data[i] = new LinkedList<>();
        }
    }

    public void put(int key, int value) {
        int hash = hash(key);
        Iterator<Entry> iterator = data[hash].iterator();
        while (iterator.hasNext()){
            Entry entry = iterator.next();
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
        }
        data[hash].offerLast(new Entry(key, value));
    }

    public int get(int key) {
        int hash = hash(key);
        Iterator<Entry> iterator = data[hash].iterator();
        while (iterator.hasNext()){
            Entry entry = iterator.next();
            if (entry.key == key) {
                return entry.getValue();
            }
        }
        return -1;
    }

    public void remove(int key) {
        int hash = hash(key);
        Iterator<Entry> iterator = data[hash].iterator();
        while (iterator.hasNext()){
            Entry entry = iterator.next();
            if (entry.key == key) {
                data[hash].remove(entry);
                return;
            }
        }
    }

    private int hash(int key){
        return key % base;
    }

    private class Entry{
        private int key;
        private int value;

        public Entry() {
        }

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return key == entry.key && value == entry.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}
