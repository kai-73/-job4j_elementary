package exercises.arrays;
import java.util.Arrays;

/**
 * 5.5. Циклический сдвиг вправо
 * Ваша задача выполнить циклический сдвиг вправо с шагом count
 * Например,
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */

public class SymmetricDiff54 {
    public static int[] diff(int[] left, int[] right) {
        if (left.length * right.length == 0) {
            return left.length + right.length == 0 ? new int[0] : left.length > 0 ? left : right;
        }
        int[] sum = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
            if (left[i] == right[j]) {
                i++;
                j++;
            } else {
                if (left[i] < right[j]) {
                    sum[k++] = left[i++];
                } else {
                    sum[k++] = right[j++];
                }
            }
        }
            while (i < left.length) {
                sum[k++] = left[i++];
            }
                while (j < right.length) {
                  sum[k++] = right[j++];
                }
        return Arrays.copyOf(sum, k);
    }

//    public static int[] merge(int[] left, int[] right) {
//        int[] merge = new int[left.length + right.length];
//        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;
//        while (leftIndex < left.length && rightIndex < right.length) {
//            if (left[leftIndex] <= right[rightIndex]) {
//                merge[mergeIndex++] = left[leftIndex++];
//            } else {
//                merge[mergeIndex++] = right[rightIndex++];
//            }
//        }
//        while (leftIndex < left.length) {
//            merge[mergeIndex++] = left[leftIndex++];
//        }
//        while (rightIndex < right.length) {
//            merge[mergeIndex++] = right[rightIndex++];
//        }
//        return merge;
//    }

    public static void main(String[] args) {
        //int[] a = new int[]{1, 3, 5, 6, 7, 11, 99};
        //int[] b = new int[]{1, 2, 3, 4, 6, 8, 10};
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] result = diff(a, b);
        //System.out.println(Arrays.toString(merge(a, b)));
        System.out.println(Arrays.toString(result));
        System.out.println(result.length);
    }
}

