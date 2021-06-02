package com.lwh6a.leetcode.other;

/**
 * 代码描述: 爬楼梯
 *
 * @author liuwenhao
 * @date 2021/4/19
 */

public class ClimbStairs {


    public static int climbStairs(int n){
        if (n == 1 || n ==2) {
            return n;
        }
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i -1] + arr[i -2];
        }
        return arr[n];
    }
}
