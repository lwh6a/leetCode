package com.lwh6a.leetcode.solution;

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
            add(a);
        }
    }

    public int add(int val) {
        q.offer(val);
        if (q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
}
