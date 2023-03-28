package com.lwh6a.leetcode.solution;

import java.util.TreeMap;

/**
 * 相对名次
 *
 * @author lwh6a
 * @since 2023/3/27
 */

public class Solution506 {

    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < score.length; i++) {
            treeMap.put(score[i], i);
        }
        String[] res = new String[score.length];
        int x = 1;
        for (Integer k : treeMap.keySet()) {
            int v = treeMap.get(k);
            if (x == 1) {
                res[v] = "Gold Medal";
            }else if (x == 2) {
                res[v] = "Silver Medal";
            }else if (x == 3) {
                res[v] = "Bronze Medal";
            }else {
                res[v] = x + 1 + "";
            }
            x++;
        }
        return res;
    }
}
