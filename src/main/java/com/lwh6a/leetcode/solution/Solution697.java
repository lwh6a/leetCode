package com.lwh6a.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组的度
 *
 * @author lwh6a
 * @since 2024/2/5
 */

public class Solution697 {

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int[] ints = map.get(nums[i]);
            if (ints == null) {
                ints = new int[3];
                ints[1] = i;
            }
            ints[0]++;
            ints[2] = i;
            map.put(nums[i], ints);
        }
        int max = 0;
        int ans = 0;
        for (Integer key : map.keySet()) {
            int[] ints = map.get(key);
            if (max < ints[0]) {
                max = ints[0];
                ans = ints[2] - ints[1] + 1;
            }else if (max == ints[0]) {
                if (ans > ints[2] - ints[1] + 1) {
                    ans = ints[2] - ints[1] + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        int shortestSubArray = findShortestSubArray(nums);
        System.out.println(shortestSubArray);
    }
}
