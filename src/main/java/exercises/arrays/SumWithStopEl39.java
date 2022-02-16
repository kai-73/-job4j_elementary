package exercises.arrays;

import java.util.Arrays;

/**
 * 3.9. Сумма элементов, пока не выполнится условие.
 * Необходимо реализовать метод который принимает 2 параметра:
 * 1. Массив целочисленный значений data.
 * 2. Целое число el, которое мы будем искать в массиве data.
 * При этом должны выполниться следующие условия:
 * 1. Метод должен вернуть сумму элементов массива data, которые находятся до элемента el
 * 2. Если окажется что сумма элементов - четное число - необходимо вернуть это число, иначе - 0.
 */

public class SumWithStopEl39 {
    public static int count(int[] data, int el) {
        int elIndex = Arrays.binarySearch(data, el);
        int[] rsl = Arrays.copyOf(data, elIndex);
        int sum = 0;
        for (int i = 0; i < rsl.length; i++) {
           sum += rsl[i];
        }
        return sum % 2 == 0 ? sum : 0;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(count(data, 5));
    }
}
/*      int sum = 0;
        for (int n : data) {
                if (n == el) break;
                sum += n;

                }
                return sum % 2 == 0 ? sum : 0;

*/
