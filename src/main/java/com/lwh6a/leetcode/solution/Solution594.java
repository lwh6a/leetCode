package com.lwh6a.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长和谐子序列
 *
 * @author lwh6a
 * @since 2023/3/27
 */

public class Solution594 {

    public int findLHS(int[] nums) {
        // nums = [1,3,2,2,5,2,3,7]
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0));
        }
        for (Integer k : map.keySet()) {
            if (map.containsKey(k + 1)) {
                res = Math.max(res, map.get(k) + map.get(k + 1));
            }
        }

        return res;
    }
}
