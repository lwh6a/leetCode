package com.lwh6a.leetcode.primary.string;

/**
 * 字符串中的第一个唯一字符串
 *
 * @author lwh6a
 * @since 2021/6/9
 */

public class FirstUniqChar {

    public int firstUniqChar(String s) {
        int[] count = new int[26];
        char[] arr = s.toCharArray();
        // 遍历出每个字符出现的次数
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i] - 'a';
            count[c]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    // JavaApi
    public static int firstUniqChar2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int i = firstUniqChar2(s);
        System.out.println(i);
        System.out.println(s.indexOf(2));
        System.out.println(s.charAt(2));
    }

}
