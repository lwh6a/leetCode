package com.lwh6a.leetcode.primary.string;

import java.util.jar.JarEntry;

/**
 * 反转字符串
 *
 * @author lwh6a
 * @since 2021/6/9
 */

public class ReverseString {

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len/2; i++) {
            char tmp = s[len - i -1];
            s[len - i -1] = s[i];
            s[i] = tmp;
        }
    }

    public void reverseString2(char[] s) {
       int left = 0;
       int right = s.length - 1;

       while (left < right){
            swap(s, left++, right--);
       }
    }

    private void swap(char[] arr, int i, int j){
       // 第一种交换
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        // 第二种交换
        arr[i] = (char)(arr[i] + arr[j]);
        arr[j] = (char)(arr[i] - arr[j]);
        arr[i] = (char)(arr[i] - arr[j]);
        // 第三种交换
        arr[i] = (char)(arr[i] - arr[j]);
        arr[j] = (char)(arr[i] + arr[j]);
        arr[i] = (char)(arr[j] + arr[i]);
        // 第四种交换,^异或操作有传递性
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];

    }

    public void reverseString3(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        reverseHelper(s, 0, s.length - 1);
    }
    private void reverseHelper(char[] arr, int l, int r){
        if (l >= r) {
            return;
        }
        swapHelper(arr, l, r);
        swapHelper(arr, ++l, --r);
    }

    private void swapHelper(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void reverseStringHelper(char[] s, int left, int right) {
        if (left >= right)
            return;
        //注意，这里的顺序调换了,
        // 前++和+1在执行方法调用的执行顺序问题，
        // 前++是在方法执行之前调用的，即传入的值是已经加过的，
        // 而后++则是在方法执行之后调用，即传入的是没加过的
        reverseStringHelper(s, left + 1, right - 1);
        swap(s, left, right);
    }


}
