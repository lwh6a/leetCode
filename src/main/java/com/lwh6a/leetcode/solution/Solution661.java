package com.lwh6a.leetcode.solution;

/**
 * 图片平滑器
 *
 * @author lwh6a
 * @since 2024/2/3
 */

public class Solution661 {

    public int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum = 0, num = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < img.length && l >= 0 && l < img[0].length) {
                            num++;
                            sum += img[k][l];
                        }
                    }
                }
                res[i][j] = sum/num;
            }
        }
        return res;
    }

}
