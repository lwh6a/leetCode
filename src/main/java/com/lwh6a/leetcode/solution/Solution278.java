package com.lwh6a.leetcode.solution;

/**
 * 第一个错误的版本
 *
 * @author lwh6a
 * @since 2024/1/13
 */

public class Solution278 {

    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r){
            int mid = l + (r - l)/2;
            if (isBadVersion(mid)) {
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }

    public boolean isBadVersion(int v){
        return true;
    }
}
