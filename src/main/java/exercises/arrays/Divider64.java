package exercises.arrays;

/**
 * 6.4. Кратность числа
 * Метод принимает два параметра:
 * 1. Целочисленное значение num;
 * 2. Массив целочисленных значений ints.
 * Необходимо проверить являются ли все элементы массива ints,
 * делителями числа num, если являются - то метод должен вернуть true.
 */

public class Divider64 {
    public static boolean check(int num, int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (num % ints[i] != 0) {
                return false;
            }
        }
        return false;
    }
}
