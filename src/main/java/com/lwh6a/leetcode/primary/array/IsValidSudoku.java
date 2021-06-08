package com.lwh6a.leetcode.primary.array;

/**
 * 有效数独
 *
 * @author lwh6a
 * @since 2021/5/13
 */

public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        int[] row = new int[len];
        int[] col = new int[len];
        int[] cell = new int[len];
        for (int i = 0; i < board.length; i++) {
            char[] column = board[i];
            for (int j = 0; j < column.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int loc = 1 << board[i][j] - '0';
                int idx = i /3*3 + j/3;
                if ((row[i] & loc) > 0
                    || (col[j] & loc) > 0
                        || (cell[idx] & loc) > 0) {
                    return false;
                }
                row[i] |= loc;
                col[j] |= loc;
                cell[idx] |= loc;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println('5' - '0');

        int i = 2;
        int x = i /3*3;
        System.out.println(x);
    }

    public boolean isValidSudoku2(char[][] board) {
        int len = board.length;
        int[][] row = new int[len][len];
        int[][] col = new int[len][len];
        int[][] cell = new int[len][len];
        for (int i = 0; i < board.length; i++) {
            char[] column = board[i];
            for (int j = 0; j < column.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '0' - 1;
                int idx = i /3*3 + j/3;
                if (row[i][num] != 0
                        || col[j][num] != 0
                        || cell[idx][num] != 0) {
                    return false;
                }
                row[i][num] = 1;
                col[j][num] = 1;
                cell[idx][num] = 1;
            }

        }
        return true;
    }

}
