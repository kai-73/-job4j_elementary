package exercises;

public class SwapCols26 {
    public static void swap(int[][] data, int src, int dst) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            temp = data[dst][i];
            data[dst][i] = data[src][i];
            data[src][i] = temp;
        }
    }
}
/**
 * Тоже самое что и в предыдущем упражнении №25,толькл с разницей, что здесь меняем местами
 * индексы столца, через временную переменную temp.
 */
