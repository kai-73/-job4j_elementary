package exercises;

public class LoopForBoard15 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int[] ints : array) {
            for (int j = 1; j < ints.length - 1; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
