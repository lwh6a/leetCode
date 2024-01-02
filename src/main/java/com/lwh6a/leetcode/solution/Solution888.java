package com.lwh6a.leetcode.solution;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 公平的糖果交换
 *
 * @author lwh6a
 * @since 2023/3/29
 */

public class Solution888 {


    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int aliceSize : aliceSizes) {
            set.add(aliceSize);
            aliceSum += aliceSize;
        }
        int bobSum = Arrays.stream(bobSizes).sum();
        int x = (aliceSum - bobSum)/2;
        for (int c : bobSizes) {
            int m = c + x;
            if (set.contains(m)) {
                return new int[]{m,c};
            }
        }

        return new int[2];
    }
}
