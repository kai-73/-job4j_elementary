package exercises.arrays;

public class CheckSquareArray13 {
    public static boolean checkArray(int[][] array) {
        int standard = array.length;
        for (int[] ints : array) {
            if (ints.length != standard) {
                return false;
            }
        }
        return true;
    }
}
