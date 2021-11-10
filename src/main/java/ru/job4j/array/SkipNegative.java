package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] arrGlobal : array) {
            for (int j = 0; j < arrGlobal.length; j++) {
                if (arrGlobal[j] < 0) {
                    arrGlobal[j] = 0;
                }
            }
        }
        return array;
    }
}

