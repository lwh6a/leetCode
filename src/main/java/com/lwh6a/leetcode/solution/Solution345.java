package com.lwh6a.leetcode.solution;

/**
 * 反转字符串中的元音字母
 * @author lwh6a
 * @since 2024/1/15
 */

public class Solution345 {

    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right){
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (right > 0 && !isVowel(chars[right])) {
                right--;
            }
            if (left < right){
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = chars[tmp];
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public boolean isVowel(char c){
        return "aioueAIOUE".indexOf(c) >= 0;
    }
}
