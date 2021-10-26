package ru.job4j.condition;

public class Triagle1 {

    public static void exist(double ab, double ac, double bc) {
        boolean condition = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        System.out.println(condition);
    }

    public static void main(String[] args) {
        Triagle1.exist(2, 2, 2);
    }
}
