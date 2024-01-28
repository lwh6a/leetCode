package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 最小索引和
 *
 * @author lwh6a
 * @since 2024/1/28
 */

public class Solution599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        ArrayList<String> res = new ArrayList<>();
        int idx = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            Integer integer = map.get(list2[i]);
            if (integer != null) {
                if ((integer + i) < idx) {
                    res.clear();
                    res.add(list2[i]);
                    idx = integer + i;
                }else if ((integer + i) == idx) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
