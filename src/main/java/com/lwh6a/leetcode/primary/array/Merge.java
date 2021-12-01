package com.lwh6a.leetcode.primary.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 合并区间
 *
 * @author lwh6a
 * @since 2021/6/30
 */

public class Merge {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int[][] res = new int[intervals.length][2];
        int s = 0;
        int[] arr = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (arr[1] >= curr[0]) {
                arr[1] = Math.max(curr[1], arr[1]);
            } else {
                res[s++] = arr;
                arr = curr;
            }
        }
        res[s++] = arr;
        return Arrays.copyOfRange(res, 0, s + 1);
    }

    public static void main(String[] args) {
        // [[1,3],[2,6],[8,10],[15,18]]
        int[][] arr = new int[4][2];
        arr[0] = new int[]{1, 3};
        arr[1] = new int[]{2, 6};
        arr[2] = new int[]{8, 10};
        arr[3] = new int[]{15, 18};
        int[][] merge = merge(arr);
        System.out.println(merge);
    }
}
