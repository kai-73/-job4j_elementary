package exercises.arrays;

import java.util.Arrays;

/**
 * 4.1. Массив без четных значений.
 * Метод принимает массив целочисленных значений.
 * Необходимо перебрать этот массив выбрать из него только нечетные числа
 * и вернуть новый массив, в котором будут только нечетные числа.
 * При этом длина нового массива должна совпадать с количеством
 * нечетных значений в исходном массиве.
 */

public class ArrayWithoutEvenElements41 {
    public static int[] changeData(int[] data) {
        int[] odd = new int[data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                odd[count++] = data[i];
            }
        }
        return Arrays.copyOf(odd, count);
    }
}
