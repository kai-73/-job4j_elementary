package exercises.cycles;

/**
 * 1.1. Найти сумму каждого второго числа в диапазоне
 * Даны два целых положительных числа a и b (b > a).
 * Надо сложить каждое второе число в диапазоне [a, b] начиная с первого
 *
 * Например,
 *
 * [1, 2] => 1
 *
 * [1, 3] => 1 + 3 = 4
 *
 * [1, 5] => 1 + 3 + 5 = 9
 *
 * [0, 5] => 0 + 2 + 4 = 6
 */
public class SecondSum11 {

    public static int sum(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i += 2) {
            rsl += i;
        }
        return rsl;
    }
}

