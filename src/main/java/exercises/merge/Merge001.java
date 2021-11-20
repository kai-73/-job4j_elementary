package exercises.merge;

/**
 * Простое объединение двух массивов без сортировки
 */
public class Merge001 {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[count++] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            rsl[count++] = right[i];
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = {1, 3, 5};
        int[] right = {5, 2, 3, 0};
        int[] rsl = merge(left, right);
        for (int i = 0; i < (left.length + right.length); i++) {
            System.out.print(rsl[i]);
        }
    }
}
