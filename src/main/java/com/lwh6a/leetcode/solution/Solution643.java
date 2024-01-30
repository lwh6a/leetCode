package com.lwh6a.leetcode.solution;

/**
 * 子数组最大平均数1
 *
 * @author lwh6a
 * @since 2024/1/30
 */

public class Solution643 {

    public static double findMaxAverage(int[] nums, int k) {
        double ans;
        double sum = 0;
        int i = 0;
        int j = 0;
        while (j < k){
            sum += nums[j++];
        }
        ans = sum/k;
        while (j < nums.length){
            sum = sum - nums[i++] + nums[j++];
            ans = Math.max(ans, sum/k);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        double maxAverage = findMaxAverage(nums, 4);
        System.out.println(maxAverage);
    }

    public static double findMaxAverage2(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            int sumSub = sum - nums[i - k] + nums[i];
            sum = Math.max(sum, sumSub);
        }
        return 1.0*sum/k;
    }
}
