package com.lwh6a.leetcode.solution;

/**
 * 完美数
 *
 * @author lwh6a
 * @since 2024/1/23
 */

public class Solution507 {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        int divisor = 2;
        while (divisor * divisor <= num){
            if (num % divisor == 0) {
                sum += divisor;
                if (divisor != num / divisor) {
                    sum += num / divisor;
                }
            }
            divisor++;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(28 % 4);
    }
}
