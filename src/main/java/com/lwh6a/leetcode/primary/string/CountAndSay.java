package com.lwh6a.leetcode.primary.string;

/**
 * 外观数列
 *
 * @author lwh6a
 * @since 2021/6/29
 */

public class CountAndSay {

    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        StringBuilder pre;
        int count;
        char say;
        for (int i = 1; i < n; i++) {
            pre = res;
            res = new StringBuilder();
            count = 1;
            say = pre.charAt(0);
            for (int j = 1; j < pre.length(); j++) {
                if (say != pre.charAt(j)) {
                    res.append(count).append(say);
                    count = 1;
                    say = pre.charAt(j);
                } else {
                    count++;
                }
            }
            res.append(count).append(say);
        }
        return res.toString();
    }
}
