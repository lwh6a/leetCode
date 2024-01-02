package com.lwh6a.leetcode.solution;

import java.util.HashSet;

/**
 * 两个数组的交集
 *
 * @author lwh6a
 * @since 2023/3/22
 */

public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                resSet.add(nums2[i]);
            }
        }
        int[] res = new int[resSet.size()];
        int idx = 0;
        for (Integer integer : resSet) {
            res[idx++] = integer;
        }
        return res;
    }
}
