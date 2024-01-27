package com.lwh6a.leetcode.solution;

import java.util.HashSet;

/**
 * 分糖果
 *
 * @author lwh6a
 * @since 2024/1/27
 */

public class Solution575 {

    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(set.size(), candyType.length/2);
    }
}
