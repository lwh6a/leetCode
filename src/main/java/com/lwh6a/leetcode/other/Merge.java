package com.lwh6a.leetcode.other;

/**
 * 合并两个数组
 *
 * @author lwh6a
 * @since 2023/3/21
 */

public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m-- + --n;
        while (n >=0){
            if (m >= 0 && nums2[n] < nums1[m]) {
                nums1[len--] = nums1[m--];
            }else {
                nums1[len--] = nums2[n--];
            }
        }
    }
}
