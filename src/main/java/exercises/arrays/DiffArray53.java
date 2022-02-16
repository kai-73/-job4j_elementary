package exercises.arrays;
import java.util.Arrays;

/**
 * 5.3. Разность множеств
 * Разность множеств это операция при которой в результирующее множество попадают элементы из первого множества, но только если их нет во втором множестве.
 * Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов
 * Например,
 * {1}, {2} => {1}
 * {1}, {1} => {}
 * {1, 2}, {2} => {1}
 * {1}, {} => {1}
 */

public class DiffArray53 {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new  int[left.length];
        if (right.length == 0 || left.length == 0) {
            rsl = left;
            return rsl;
        }
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] != right[j]) {
                    rsl[count++] = left[i];
                }
            }
        }
        return   Arrays.copyOf(rsl, count);
    }

    public static void main(String[] args) {
        //int[] a = new int[]{1, 3, 3, 2, 4, 2, 3, 3, 5, 2, 1, 99};
        //int[] b = new int[]{1, 3, 2, 1, 3, 2, 4, 6, 3, 4};
        int[] a = {1, 3};
        int[] b = {2};
        int[] result = diff(a, b);
        System.out.println(Arrays.toString(result));
    }
}
/*
int[] result = new int[left.length];
        int count = 0;
        if (right.length == 0 || left.length == 0) {
            result = left;
            return result;
        } else {
            for (int l : left) {
                for (int r : right) {
                    if (l == r) {
                        break;
                    }
                    result[count++] = l;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}
 */