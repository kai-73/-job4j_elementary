package exercises.arrays;

import java.util.Arrays;

public class CheckSumIndexes38 {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] result = new int[data.length * data[0].length];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (i + j != sum) {
                    result[k] = data[i][j];
                    k++;
                }
            }
        }
        return  Arrays .copyOf(result, k);
    }
}
