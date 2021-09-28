package ru.job4j.calculator;

//Использование методов
public class Calculator2 {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator2.plus(100, 50);
        Calculator2.plus(4, 2);
        Calculator2.plus(3, 5);
    }
}
