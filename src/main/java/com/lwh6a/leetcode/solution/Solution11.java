package com.lwh6a.leetcode.solution;

/**
 * 最多盛水容器
 *
 * @author lwh6a
 * @since 2024/5/12
 */

public class Solution11 {

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;
        while (l <= r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
