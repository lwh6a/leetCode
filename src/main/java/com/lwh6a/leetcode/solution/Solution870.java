package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 *
 * @author lwh6a
 * @since 2026/4/9
 */

public class Solution870 {

    public static int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);

        int n = nums1.length;
        Integer[] idx = new Integer[n];
        Arrays.setAll(idx, i -> i);
        Arrays.sort(idx, (i, j) -> nums2[i] - nums2[j]);

        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        for (int x : nums1) {
            int i = x > nums2[idx[left]] ? idx[left++] : idx[right--];
            ans[i] = x;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {1, 10, 4, 11};
        int[] idx = advantageCount(nums1, nums2);
        System.out.println(Arrays.toString(idx));
    }
}
