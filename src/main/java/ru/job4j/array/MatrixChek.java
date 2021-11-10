package ru.job4j.array;

public class MatrixChek {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            return board[row][i] == 'X';
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int columm) {
        for (int i = 0; i < board[columm].length; i++) {
            return board[i][columm] == 'X';
        }
        return true;
    }
}
