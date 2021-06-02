package com.lwh6a.leetcode.primary.array;

import java.util.HashSet;

/**
 * 存在重复元素
 *
 * @author lwh6a
 * @since 2021/5/12
 */

public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashSet set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
