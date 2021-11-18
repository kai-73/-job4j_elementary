package exercises;

public class SwapRows25 {
    public static void swap(int[][] data, int src, int dst) {
        int temp;
        for (int i = 0; i < data[0].length; i++) {
            temp = data[i][dst];
            data[i][dst] = data[i][src];
            data[i][src] = temp;
        }
    }
}
/**
 * Здесь нужно в 2 мерном квадр массиве переставить местами две строки. Это осуществляем
 * путем перестановки замены местами первого параметра массива(указателя строки) - аналогично алгоритму перестановки
 * элементов местами через доп переменную termp.
 */
