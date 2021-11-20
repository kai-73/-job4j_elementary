/**
 * Упражнения
 * 1.1.6. Массивы
 * 0.3. Объединить два отсортированных массива
 */



package exercises.merge;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = 0;
        int i = 0;
        int j = 0;
        while (size != rsl.length) {
            while (i != left.length && j != right.length) {
                if (left[i] < right[j]) {
                    rsl[size++] = left[i++];
                } else {
                    rsl[size++] = right[j++];
                }
            }
            if (i < left.length) {
                rsl[size++] = left[i++];
            } else if (j < right.length) {
                rsl[size++] = right[j++];
            }
        }
        return rsl;
    }
}

 /**  public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
*/
/**
    public static void main(String[] args) {
        int[] left = {1, 3, 5};
        int[] right = {5, 2, 3, 0};
        int[] z = merge(left, right);
        int i = 0;
        while (i < z.length) {
            System.out.print(z[i++]);
        }
    }

**/
