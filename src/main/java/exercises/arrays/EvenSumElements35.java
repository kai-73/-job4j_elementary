package exercises.arrays;

/**
 * Метод принимает массив целочисленных значений.
 * Метод должен определить сумму всех элементов в массиве,
 * проверить значение суммы является ли оно четным числом.
 */
public class EvenSumElements35 {
    public static boolean checkArray(int[] data) {
        int i = 0, summ = 0;
        while (i < data.length) {
            summ += data[i++];
        }
        return summ % 2 == 0;
    }
}
