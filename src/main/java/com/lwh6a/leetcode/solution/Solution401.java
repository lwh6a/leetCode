package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 二进制手表
 *
 * @author lwh6a
 * @since 2024/1/16
 */

public class Solution401 {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for (int h = 0; h < 12; ++h) {
            for (int m = 0; m < 60; ++m) {
                if ((Integer.bitCount(h) + Integer.bitCount(m)) == turnedOn) {
                    list.add(h + ":" + (m < 10? "0":"") + m);
                }
            }
        }
        return list;
    }
}
