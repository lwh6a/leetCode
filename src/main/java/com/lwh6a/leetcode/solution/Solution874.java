package com.lwh6a.leetcode.solution;

import java.util.HashSet;

/**
 *
 * @author lwh6a
 * @since 2026/4/15
 */

public class Solution874 {

    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 上右下左（顺时针）

    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<Integer> obstacleSet = new HashSet<>(obstacles.length, 1); // 预分配空间
        final int OFFSET = (int) 3e4;
        for (int[] p : obstacles) {
            // p 是两个 16 位整数，合并成一个 32 位整数
            obstacleSet.add((p[0] + OFFSET) << 16 | (p[1] + OFFSET));
        }

        int x = 0;
        int y = 0;
        int k = 0;
        int ans = 0;
        for (int c : commands) {
            if (c == -1) { // 右转
                k = (k + 1) % 4;
            } else if (c == -2) { // 左转
                k = (k + 3) % 4;
            } else { // 直行
                while (c-- > 0) {
                    int nx = x + DIRS[k][0];
                    int ny = y + DIRS[k][1];
                    if (obstacleSet.contains((nx + OFFSET) << 16 | (ny + OFFSET))) {
                        break;
                    }
                    x = nx;
                    y = ny;
                }
                ans = Math.max(ans, x * x + y * y);
            }
        }
        return ans;
    }
}
