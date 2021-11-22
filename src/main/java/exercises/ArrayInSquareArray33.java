/*
Метод принимает массив целочисленных значений.
Необходимо реализовать метод, который превратит одномерный массив в квадратный двумерный.
Напомню, что квадратный двумерный массив - это массив, в котором число рядов и элементов
в каждом ряду одинаково. При этом если элементов в исходном массиве не хватает, чтобы заполнить
весь двумерный массив - необходимо заполнить его 0.
 */
package exercises;

public class ArrayInSquareArray33 {
    public static int[][] convertArray(int[] array) {
        int size = (int) (Math.ceil(Math.sqrt(array.length)));
        int[][] rsl = new int[size][size];
        int i = 0, row = 0, cell = 0;
        while (i < array.length) {
            while (cell < size) {
                rsl[row][cell++] = i < array.length ? array[i++] : 0;
            }
            cell = 0;
            row++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 6, 7};
        int[][] rsl = convertArray(array);
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                System.out.print(rsl[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/*
package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
       int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] rsl = new int[size][size];
      	int i = 0, row = 0, cell = 0;
        while (i < array.length) {
            rsl[row][cell++] = array[i++];
            if (cell == size) {
                cell = 0;
                row++;
            }
        }
        return rsl;
    }
}
 */