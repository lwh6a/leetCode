package com.lwh6a.leetcode.solution;

import java.util.HashSet;

/**
 * 快乐数
 *
 * @author lwh6a
 * @since 2024/1/9
 */

public class Solution202 {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1){
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = ha(n);
        }
        return true;
    }
    public int ha(int n){
        int r = 0;
        while (n != 0){
            int i = n % 10;
            r = r + i*i;
            n = n/10;
        }
        return r;
    }
}
