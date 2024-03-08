package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 *
 * @author lwh6a
 * @since 2024/3/8
 */

public class Solution728 {

    public static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> res = new ArrayList<>();
        while (left <= right){
            if (isSelfDividingNumbers(left)) {
                res.add(left);
            }
            left++;
        }
        return res;
    }
    public static boolean isSelfDividingNumbers(int num){
        int cur = num;
        while (cur > 0){
            int i = cur % 10;
            if(i == 0 || num % i != 0){
                return false;
            }
            cur /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(47, 85);
        list.forEach(System.out::println);
    }
}
