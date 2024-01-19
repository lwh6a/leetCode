package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 *
 * @author lwh6a
 * @since 2024/1/18
 */

public class Solution412 {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        int i = 1;
        while (i <= n){
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if ("".equals(s)) {
                s = i + "";
            }
            list.add(s);
            i++;
        }
        return list;
    }
}
