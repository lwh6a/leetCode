package com.lwh6a.leetcode.solution;

/**
 * 斐波那契数
 *
 * @author lwh6a
 * @since 2024/1/23
 */

public class Solution509 {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int a = 0, b = 1, i = 2;
        while (i < n){
            if (i % 2 == 0) {
                a += b;
            }else {
                b += a;
            }
            i++;
        }
        return a + b;
    }

    public int fib2(int n) {
        return n <= 1? n:fib2(n - 1) + fib2(n - 2);
    }
    public int fib3(int n) {
        int[] nums = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040};
        return nums[n];
    }
}
