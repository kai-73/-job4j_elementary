package ru.job4j.condition;

public class IfElseReturn1 {
    public static boolean greatThen(int first, int second) {
        boolean compare = first > second;
        return compare;
    }

    public static void main(String[] args) {
        boolean result = greatThen(10, 2);
        System.out.println(result);
        System.out.println(IfElseReturn1.greatThen(10, 34));
    }
}
