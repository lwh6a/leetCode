package com.lwh6a.leetcode.solution;

/**
 * 最大三角形面积
 *
 * @author lwh6a
 * @since 2024/5/11
 */

public class Solution812 {

    public double largestTriangleArea(int[][] points) {
        double area = 0;
        int len = points.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    area = Math.max(area, getArea(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]));
                }
            }
        }
        return area;
    }

    public double getArea(int x1, int x2, int x3, int y1, int y2, int y3) {
        return 0.5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2);
    }
}
