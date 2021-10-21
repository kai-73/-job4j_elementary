package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifferensAndDivision(double first, double second) {
        return differens(first, second) + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + differens(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumDifferensAndDivision равен: " + sumDifferensAndDivision(10, 20));
        System.out.println("Результат расчета sumAll равен: " + sumAll(10, 20));
    }
}
