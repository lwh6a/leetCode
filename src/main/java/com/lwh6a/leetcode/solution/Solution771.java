package com.lwh6a.leetcode.solution;

/**
 * 宝石和石头
 *
 * @author lwh6a
 * @since 2024/3/22
 */

public class Solution771 {

    public int numJewelsInStones(String jewels, String stones) {
        int[] arrs = new int[52];
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (c < 97) {
                arrs[c - 65]++;
            } else {
                arrs[c - 97 + 26]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (c < 97) {
                ans += arrs[c - 65];
            } else {
                ans += arrs[c - 97 + 26];
            }
        }
        return ans;
    }
}
