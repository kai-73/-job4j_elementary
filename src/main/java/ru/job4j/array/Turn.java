package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int n = array.length - 1;
        for (int index = 0; index <= n / 2; index++) {
            int temp = array[n - index];
            array[n - index] = array[index];
            array[index] = temp;
        }
        return array;
    }
}