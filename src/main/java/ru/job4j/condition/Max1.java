package ru.job4j.condition;

public class Max1 {

    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число: " + max(1, 2));
        int result = Max1.max(5, 4);
        System.out.println("Максимальное число: " + result);
    }
}