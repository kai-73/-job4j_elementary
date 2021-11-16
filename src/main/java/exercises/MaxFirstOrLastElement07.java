package exercises;

public class MaxFirstOrLastElement07 {
    public static int getMaxValue(int[] array) {
        int max = Math.max(array[0], array[array.length - 1]);
        return max;
    }
}
//        int max = array[0] > array[array.length - 1] ? array[0] :array[array.length - 1];
//      return array[0] > array[array.length - 1] ? array[0] :array[array.length - 1];