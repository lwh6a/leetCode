package com.lwh6a.leetcode.primary.array;

import java.util.HashMap;

/**
 * 两数之和
 *
 * @author lwh6a
 * @since 2021/5/13
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
