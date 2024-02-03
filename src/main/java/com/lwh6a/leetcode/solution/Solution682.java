package com.lwh6a.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 棒球比赛
 *
 * @author lwh6a
 * @since 2024/2/3
 */

public class Solution682 {

    public int calPoints(String[] operations) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for (String operation : operations) {
            int i = list.size();
            if (operation.equals("D")) {
                int dx1 = list.get(i - 1);
                ans += dx1*dx1;
                list.add(dx1*dx1);
            }else if (operation.equals("C")) {
                int dx1 = list.get(i - 1);
                ans -= dx1;
                list.remove(i - 1);
            }else if (operation.equals("+")) {
                int dx1 = list.get(i - 1);
                int dx2 = list.get(i - 2);
                ans += dx1 + dx2;
                list.add(dx1 + dx2);
            }else{
                int dx = Integer.parseInt(operation);
                ans += dx;
                list.add(dx);
            }
        }
        return ans;
    }
}
