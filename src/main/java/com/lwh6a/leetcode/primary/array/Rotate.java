package com.lwh6a.leetcode.primary.array;

import java.util.Arrays;

/**
 * 旋转数组
 *
 * @author <a href="mailto:liuwenhao@fenxiangbuy.com">刘文豪</a>
 * @since 2021/5/8
 */

public class Rotate {

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotate(nums);
        }
    }

    private void rotate(int[] nums) {
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = tmp;
            tmp = num;
        }

        nums[0] = tmp;
    }

    public static void rotate1(int[] nums, int k) {
        k = k % nums.length;
        int[] right = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(right, 0, nums, 0, k);
    }

    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;
        int[] right = new int[k];
        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            right[j] = nums[i];
            j ++;
        }

        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < right.length; i++) {
            nums[i] = right[i];
        }


    }

    public static void rotate3(int[] nums, int k) {
        int len = nums.length;
        int[] right = new int[len];
        for (int i = 0; i < len; i++) {
            right[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[(i + k)%len] = right[i];
        }

    }

    public static void rotate4(int[] nums, int k) {
        int len = nums.length;
        reverse(nums, 0, len -1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);

    }

    private static void reverse(int[] nums, int start, int end){
        while (start < end){
            int tem = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tem;
        }
    }

    public static void rotate5(int[] nums, int k) {
        int len = nums.length;
        int init = nums[0];
        int index = 0;
        boolean[] booleans = new boolean[len];
        for (int i = 0; i < len; i++) {
            index = (index + k) % len;
            if (booleans[index]) {
                //如果访问过，再次访问的话，会出现原地打转的现象，
                //不能再访问当前元素了，我们直接从他的下一个元素开始
                index = (index + 1)%len;
                init = nums[0];
                i --;
            }else {
                //把当前值保存在下一个位置，保存之前要把下一个位置的
                //值给记录下来
                booleans[index] = true;
                int tmp = nums[index];
                nums[index] = init;
                init = tmp;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate1(arr, 2);
    }
}
