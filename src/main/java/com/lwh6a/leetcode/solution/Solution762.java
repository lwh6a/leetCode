package com.lwh6a.leetcode.solution;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 二进制表示中质数个计算位置
 *
 * @author lwh6a
 * @since 2024/3/9
 */

public class Solution762 {

    public int countPrimeSetBits(int left, int right) {
//        int[] prime = {2,3,5,7,11,13,17,19,23,29,31};
        Set<Integer> set = Stream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31).collect(Collectors.toSet());
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (set.contains(Integer.bitCount(i))) {
                ans++;
            }
        }
        return ans;
    }
}
