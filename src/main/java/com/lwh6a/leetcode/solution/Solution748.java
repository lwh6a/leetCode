package com.lwh6a.leetcode.solution;

/**
 * 最短补全词
 *
 * @author lwh6a
 * @since 2024/3/9
 */

public class Solution748 {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] licensePlateArr = wordCounter(licensePlate);
        String res = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isCompletingWord(licensePlateArr, word) && word.length() < min) {
                res = word;
                min = word.length();
            }
        }
        return res;
    }

    public boolean isCompletingWord(int[] arr, String word) {
        int[] wordArr = wordCounter(word);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > wordArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] wordCounter(String word) {
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.toLowerCase().charAt(i);
            if (c >= 'a' && c <= 'z') {
                arr[(int) c - 'a']++;
            }
        }
        return arr;
    }
}
