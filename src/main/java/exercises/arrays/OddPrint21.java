package exercises.arrays;

public class OddPrint21 {

    public static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 9, 10, 13};
        print(array);
    }
}
