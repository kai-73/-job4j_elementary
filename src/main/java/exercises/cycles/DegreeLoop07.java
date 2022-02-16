package exercises.cycles;
/**
 *0.7. Найти степень числа
 * Дано целое число a и целое число n (> 0).
 * Найти a в степени n: a^n = a·a· . . . ·a (числа a перемножаются n раз).
 */

public class DegreeLoop07 {
    public static int calculate(int a, int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= a;
        }
        return rsl;
    }

}
