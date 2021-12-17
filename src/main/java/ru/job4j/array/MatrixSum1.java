package ru.job4j.array;

public class MatrixSum1 {
    public static int sum(int[][] array) {
        int rsl = 0;

        for (int[] arr : array) {
            for (int num : arr) {
                rsl += num;
            }
        }
        return rsl;
    }
}
