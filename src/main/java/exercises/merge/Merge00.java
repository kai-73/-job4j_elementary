package exercises.merge;

/**
 * Объединение из учебника. Просто иэффективно!!
 */

public class Merge00 {
    public static int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                merge[mergeIndex++] = left[leftIndex++];
            } else {
                merge[mergeIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            merge[mergeIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            merge[mergeIndex++] = right[rightIndex++];
        }
        return merge;
    }
}
