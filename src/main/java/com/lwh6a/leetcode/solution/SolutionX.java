package com.lwh6a.leetcode.solution;

import java.util.Arrays;

/**
 * 代码描述: 未知
 *
 * @author liuwenhao
 * @since 2020/8/7 11:33
 */

public class SolutionX {

    public static void main(String[] args) {
        ad();
//        myPow(3, 5);
    }

    public static void myPow(int x, int n) {
        int pow = 1;
        while (n > 0) {
            int i = n & 1;
            if ((n & 1) == 1) {
                pow *= x;
            }
            x *= x;
            n >>= 1;
        }
        System.out.println(pow);
    }

    public static void ad() {
        int[][] a = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] b = {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}};
        int[][] c = new int[3][3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(a[i][k] * b[k][j]);
                    c[i][j] += a[i][k] * b[k][j];
                    count++;
                }
            }
        }
        System.out.println(c.length);
        System.out.println(count);
        for (int i = 0; i < c.length; i++) {

            System.out.println(Arrays.toString(c[i]));
        }
    }

}
