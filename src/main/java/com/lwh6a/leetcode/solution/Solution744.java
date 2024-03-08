package com.lwh6a.leetcode.solution;

/**
 * 寻找比目标字母大的最小字母
 *
 * @author lwh6a
 * @since 2024/3/8
 */

public class Solution744 {

    public char nextGreatestLetter(char[] letters, char target) {
        char res = '|';
        for (char letter : letters) {
            if (letter > target) {
                res = (char) Math.min(res, letter);
            }
        }
        return res == '|'? letters[0]:res;
    }
}
