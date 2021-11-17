package exercises;

public class EvenPrint22 {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = array.length - 1 - i; //индексы элементов, начиная с последнег
            if (array[j] % 2 == 0) {
                System.out.println(array[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 9, 10, 13};
        print(array);
    }

}
