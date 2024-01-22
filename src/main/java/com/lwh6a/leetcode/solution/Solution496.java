package com.lwh6a.leetcode.solution;

/**
 * 下一个更大元素
 *
 * @author lwh6a
 * @since 2024/1/22
 */

public class Solution496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length && nums1[i] != nums2[j]){
                j++;
            }
            int k = j + 1;
            while (k < nums2.length && nums2[k] < nums1[i]){
                k++;
            }
            res[i] = k < nums2.length? nums2[k] : -1;
        }
        return res;
    }
}
