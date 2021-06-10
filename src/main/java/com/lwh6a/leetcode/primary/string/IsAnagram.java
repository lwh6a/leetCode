package com.lwh6a.leetcode.primary.string;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 有效的字母异位词
 *
 * @author lwh6a
 * @since 2021/6/10
 */

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        boolean equals = Arrays.equals(chars, chars1);
        return equals;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.toCharArray().length; i++) {
            count[s.charAt(i) - 'a' - 1]++;
        }
        for (int i = 0; i < t.toCharArray().length; i++) {
            count[t.charAt(i) - 'a' - 1]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }


    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        int count = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (++map[s.charAt(i) - 'a' - 1] == 1) {
                count++;
            }
            if (--map[t.charAt(i) - 'a' - 1] == 0) {
                count--;
            }
        }

        return count == 0;
    }

}
