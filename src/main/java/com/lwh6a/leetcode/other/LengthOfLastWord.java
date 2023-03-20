package com.lwh6a.leetcode.other;

/**
 * @author lwh6a
 * @since 2023/3/20
 */

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) != ' ') {
                res++;
            }else if (res != 0){
                return res;
            }
        }
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == ' ' && res != 0) {
                return res;
            }else {
                res++;
            }
        }
        return res;
    }
}
