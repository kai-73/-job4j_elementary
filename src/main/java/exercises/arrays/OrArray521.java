package exercises.arrays;

import java.util.Arrays;

public class OrArray521 {
    public static int[] or(int[] left, int[] right) {
        boolean exist;
        int[] rsl = Arrays.copyOf(left, left.length);

        for (int count = 0; count < right.length; count++) {
            int el = right[count];
            exist = false;
            for (int j = 0; j < rsl.length; j++) {
                int i = rsl[j];
                if (el == i) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                rsl = Arrays.copyOf(rsl, rsl.length + 1);
                rsl[rsl.length - 1] = el;
            }
        }
        return rsl;
    }
}
