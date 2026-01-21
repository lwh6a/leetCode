package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwh6a
 * @since 2025/12/5
 */

public class Solution729 {
    private List<int[]> books;

    public Solution729() {
        books = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        endTime--;
        for (int[] ints : books) {
            int l = ints[0];
            int r = ints[1];
            if (startTime > r || endTime < l) {
                continue;
            }
            return false;
        }
        books.add(new int[]{startTime, endTime});
        return true;
    }
}
