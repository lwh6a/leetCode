package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到所有数组中消失的数字
 *
 * @author lwh6a
 * @since 2024/1/20
 */

public class Solution448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = (nums[i] - 1) % n;
            nums[j] += n;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
