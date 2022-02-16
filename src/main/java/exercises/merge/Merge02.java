package exercises.merge;

/**
 * Объединение от JOB4J
 */

public class Merge02 {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int rslPoint = 0;
        while (rslPoint != rsl.length) {
            while (leftPoint != left.length && rightPoint != right.length) {
                rsl[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
            }
            while (leftPoint != left.length) {
                rsl[rslPoint++] = left[leftPoint++];
            }
            while (rightPoint != right.length) {
                rsl[rslPoint++] = right[rightPoint++];
            }
        }
        return rsl;
    }
}
