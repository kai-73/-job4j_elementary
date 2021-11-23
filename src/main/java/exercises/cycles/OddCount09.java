package exercises.cycles;

/**
 * 0.9. Найти количество нечетных в диапазоне
 * Даны два целых положительных числа a и b (b > a).
 * Найти количество нечетных чисел в диапазоне [a, b].
 * Нечетным считается число, у которого остаток от деления на 2 равен 1
 */
public class OddCount09 {
    public static int count(int a, int b) {
        int rsl = 0;
        int i = a;
        while (i <= b) {
            if (i % 2 == 0) {
                rsl++;
            }
            i++;
        }
    return rsl;
    }
}
