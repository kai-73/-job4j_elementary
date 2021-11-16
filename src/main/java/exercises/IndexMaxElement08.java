package exercises;

public class IndexMaxElement08 {
    public static int getIndexMax(int[] array) {
        return array[0] > array[array.length - 1] ? 0 : array.length - 1;
    }
}