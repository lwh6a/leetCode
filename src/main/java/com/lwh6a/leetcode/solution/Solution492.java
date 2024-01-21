package com.lwh6a.leetcode.solution;

/**
 * 构造矩形
 *
 * @author lwh6a
 * @since 2024/1/21
 */

public class Solution492 {

    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0){
            w--;
        }
        return new int[]{area/w,w};
    }
    public int[] constructRectangle2(int area) {
        int[] res = new int[2];
        int w = 1, l = area;
        int cha = Integer.MAX_VALUE;
        while (l >= w){
            if (l * w <= area) {
                if (l * w == area && l - w < cha) {
                    res[0] = l;
                    res[1] = w;
                    cha = l - w;
                }
                w++;
            }else {
                l--;
            }
        }
        return res;
    }
}
