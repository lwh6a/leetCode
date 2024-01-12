package com.lwh6a.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 存在重复元素2
 *
 * @author lwh6a
 * @since 2024/1/10
 */

public class Solution219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        int i = 0;
        int j = 1;
        while (j < nums.length){
            if (Math.abs(i - j) <= k) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j++;
            }else {
                i++;
                j = i + 1;
            }

        }
        return false;
    }

    public boolean containsNearbyDuplicate3(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
