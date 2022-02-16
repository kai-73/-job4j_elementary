package exercises.arrays;

/**
 * 3.6. Проверка массива на уникальность элементов.
 * Метод принимает массив целочисленных значений,
 * а также число value, которое мы будем искать в этом массиве.
 * Метод должен посчитать количество одинаковых элементов которые совпадают с value,
 * и если окажется что это число больше или равно половине длины входного массива -
 * массив считается невалидным и метод должен вернуть false.
 */
public class Validator36 {

    public static boolean checkArray(int[] data, int value) {
        int summ = 0, i = 0, n = data.length / 2;
        while (i < data.length) {
            if (data[i++] == value) {
                summ += value;
            }
        }
        return summ < data.length / 2;
    }
}
