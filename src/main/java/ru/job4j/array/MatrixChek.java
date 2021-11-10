package ru.job4j.array;

public class MatrixChek {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            return board[row][i] == 'X';
        }
        return true;
    }
}
