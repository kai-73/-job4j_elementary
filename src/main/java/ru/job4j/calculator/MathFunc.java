package ru.job4j.calculator;

public class MathFunc {

        public static void func1(int x) {
            int y = x * x + 1;
            System.out.println(y);
        }
        public static void func2(int x) {
            int y = x * 10;
            System.out.println(y);
        }

        public static void main(String[] args) {
            MathFunc.func1(3);
            MathFunc.func2(5);
        }
}
