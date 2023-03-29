package com.lwh6a.leetcode.sort;

import java.util.PriorityQueue;

/**
 * 代码描述:
 *
 * @author liuwenhao
 * @since 2020/7/17 16:33
 */

public class Solution703 {

    private final PriorityQueue<Integer> q;
    private int k;

    public Solution703(int[] arr, int k) {
        this.q = new PriorityQueue<Integer>(k);
        this.k = k;
        for (int a : arr) {
            q.add(a);
        }
    }

    public int add(int n) {
        if (q.size() < k) {
            q.add(n);
        } else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }
}
