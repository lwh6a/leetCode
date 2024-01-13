package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 汇总区间
 *
 * @author lwh6a
 * @since 2024/1/12
 */

public class Solution228 {

    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        List<String> list = new ArrayList<>();
        while (i < nums.length){
            int l = i;
            i++;
            while (i < nums.length && nums[i] == nums[i - 1] + 1){
                i++;
            }
            String tmp = nums[l]+"";
            if (l < i - 1) {
                tmp += "->" + nums[i - 1];
            }
            list.add(tmp);
        }
        return list;
    }
}
