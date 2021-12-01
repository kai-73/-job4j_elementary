package exercises.arrays;
import java.util.Arrays;

/**
 * 5.2. Объединение множеств
 * Объединение множеств это такая операция при которой в результирующее множество попадают элементы, которые есть хотя бы в одном множестве.
 * Ваша задача реализовать эту операцию. Множества заданы в виде массива
 * Например,
 * {1}, {2} => {1, 2}
 * {1, 2}, {2} => {1, 2}
 * {1, 2}, {3} => {1, 2, 3}
 * {1}, {} => {1}
 * Вначале объеденяем два массива в один без сортировки(в задаче не определено,
 * отсортированы ли входные массивы), и не определяется , должен ли быть отсортирован выходной массив.
 * В решении выходной массив не сортируется.
 */

public class OrArray52 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 3, 2, 4, 2, 3, 3, 5, 2, 1, 99};
        int[] b = new int[]{1, 3, 2, 1, 3, 2, 4, 6, 3, 4};
        //int[] left = {};
        //int[] right = {};
        int[] result = or(a, b);
        System.out.println(Arrays.toString(result));
    }

    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            rsl[left.length + i] = right[i];
        }
        System.out.println(Arrays.toString(rsl));

        for (int i = 0; i < rsl.length; i++) {
            for (int j = i + 1; j < rsl.length; j++) {
                if (rsl[i] == rsl[j]) {
                    rsl[j] = -1;          //line  12
                }
            }
        }
        System.out.println(Arrays.toString(rsl));
        int count = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (rsl[i] != -1) {
                rsl[count++] = rsl[i];
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
/*
 public static int[] or(int[] left, int[] right) {
    int[] rsl = left.length > 0 ? left : right;
        int count = rsl.length;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (rsl[i] != right[j] && Arrays.binarySearch(rsl, right[j]) < -1) {
                  rsl = Arrays.copyOf(rsl, ++count);
                  rsl[count - 1] = right[j];
                }
            }
        }
        return rsl;
    }
 */
