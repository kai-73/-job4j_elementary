package exercises.arrays;
import java.util.Arrays;

/**
 * 5.1. Пересечение множеств
 * Множество - это набор уникальных элементов. Пересечение множеств - это такая операция, когда в результирующее множество попадают только элементы, которые есть в обоих множествах. Если нет такие элементов, то результат пустое множество.
 * Ваша задача реализовать данную операцию в коде. Множества заданы массивами
 * Например,
 * {1, 2} и {3, 4} => {}, нет общих элементов
 * {1, 2} и {1, 3, 4} => {1}, 1 общий элемент
 * {1, 2} и {1, 2, 3, 4} => {1, 2}, 1 и 2 общие элементы
 */

public class AndArray51 {
    public static int[] and(int[] left, int[] right) {
        //int arrayLength = Math.max(left.length, right.length);
        int[] array = new int[Math.max(left.length, right.length)];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    array[count++] = right[j];
                }
            }
        }
        return Arrays.copyOf(array, count);
    }
}
