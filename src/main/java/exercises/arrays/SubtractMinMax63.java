package exercises.arrays;

/**
 * 6.3. Разница между минимумом и максимумом
 * Метод принимает массив целочисленных значений,
 * при этом это могут быть как положительные значения, так и отрицательные.
 * Необходимо реализовать в методе следующее:
 * 1. Найти максимальное значение в массиве;
 * 2. Найти минимальное значение в массиве;
 * 3. Вернуть разницу между максимальным и минимальным значением в массиве.
 * При этом массив не может быть пустым, поэтому дополнительная проверка,
 * что длина массива больше 0 - не нужна.
 */
public class SubtractMinMax63 {
    public static int calculate(int[] ints) {
        int max = ints[0], min = ints[0];
        for (int anInt : ints) {
            if (max < anInt) {
                max = anInt;
            }
            if (min > anInt) {
                min = anInt;
            }
        }
        return max - min;
    }
}
