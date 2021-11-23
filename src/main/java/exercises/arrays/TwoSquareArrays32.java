package exercises.arrays;

import java.util.Arrays;

public class TwoSquareArrays32 {

    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * left[0].length];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                rsl[index++] = Math.max(left[i][j], right[i][j]);
                }
            }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] left = {{1, 10, 55}, {16, 32, 40}, {4, 27, 7}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        System.out.println(Arrays.toString(collectArray(left, right)));

    }
}
