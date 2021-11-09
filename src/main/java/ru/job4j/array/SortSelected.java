package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {4, 8, 3, 1, 2, };
        int[] rsl = sort(data);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
