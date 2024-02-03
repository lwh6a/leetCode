package com.lwh6a.leetcode.solution;

/**
 * 机器人能否返回原点
 *
 * @author lwh6a
 * @since 2024/2/3
 */

public class Solution657 {

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'L') {
                x--;
            }else if (c == 'R') {
                x++;
            }else if (c == 'U') {
                y++;
            }else if (c == 'D') {
                y--;
            }
        }
        return x == 0 && y==0;
    }
}
