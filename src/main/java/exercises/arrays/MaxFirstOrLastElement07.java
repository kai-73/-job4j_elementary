package exercises.arrays;

public class MaxFirstOrLastElement07 {
    public static int getMaxValue(int[] array) {
        return Math.max(array[0], array[array.length - 1]);
    }
}
//        int max = array[0] > array[array.length - 1] ? array[0] :array[array.length - 1];
//      return array[0] > array[array.length - 1] ? array[0] :array[array.length - 1];