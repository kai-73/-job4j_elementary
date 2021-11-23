package exercises.arrays;

public class MaxLengthSeria24 {
    public static int find(int[] array) {
        int count = 1;
        if (array.length == 1) {
            return count;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array;
        array = new int[]{1, 2, 0, 1, 2, 3};
        System.out.println(find(array));
    }

}
