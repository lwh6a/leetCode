package com.lwh6a.leetcode.solution;

/**
 * 种花问题
 *
 * @author lwh6a
 * @since 2024/1/28
 */

public class Solution605 {

    // 第一个条件左右相邻了为0， 第一个和最后一个只要判断一侧是否为0
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] f = {0,0,1,0,0};
        boolean b = canPlaceFlowers(f, 1);
        System.out.println(b);
    }
}
