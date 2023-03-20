package com.lwh6a.leetcode.other;

import java.util.HashMap;

/**
 * @author lwh6a
 * @since 2023/3/20
 */

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                x -= map.get(s.charAt(i));
            }else {
                x += map.get(s.charAt(i));
            }
        }

        return x;
    }
}
