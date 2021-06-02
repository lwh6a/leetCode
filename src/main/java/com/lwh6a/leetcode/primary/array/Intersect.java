package com.lwh6a.leetcode.primary.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 两个数组的交集
 *
 * @author lwh6a
 * @since 2021/5/12
 */

public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0;
        int r = 0;
        while (l < nums1.length && r < nums2.length){
            if (nums1[l] < nums2[r]) {
                l ++;
            }else if (nums1[l] > nums2[r]) {
                r ++;
            }else {
                list.add(nums1[l]);
                l ++;
                r ++;
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }


    public int[] intersect2(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.getOrDefault(nums2[i], 0) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

}
