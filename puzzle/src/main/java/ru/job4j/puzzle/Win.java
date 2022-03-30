package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = isWin(board);
        return rsl;
    }
    public static boolean monoHorizontal(int[][] board, int row) {

        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean isWin(int[][] board) {
        boolean result = false;
        for (int row = 0; row < 5; row++) {
            if (board[row][row] == 1 && (Win.monoHorizontal(board, row) || Win.monoVertical(board, row))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
