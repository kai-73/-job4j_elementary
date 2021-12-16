package exercises.arrays;

/**
 * В данной задаче вам предстоит реализовать алгоритм сдвига элементов массива.
 * Вы должны написать метод который принимает в качестве параметров двумерный
 * массив(количество рядов должно быть равно количеству строк),
 * массив заполнен случайными числами от 1 до 100,
 * и два индекса
 * индекс строки и индекс колонки.
 * В данную ячейку записывается 0 а все цифры левее, правее, выше и ниже сдвигаются на 1 ячейку
 * Например было
 * {1, 2, 3},
 * {4, 5, 6},
 * {7, 8, 9} и если индексы это 1 и 1 то массив должен иметь вид
 * {1, 5, 3},
 * {5, 0, 5},
 * {7, 5, 9}
 */
public class PushTheNumbers64 {

    public static void push(int[][] array, int row, int column) {

                    for (int k = 0; k < column; k++) {
                        array[row][k] = array[row][k + 1];
                    }
                    for (int k = 0; k < array.length - column - 1; k++) {
                       array[row][array.length - 1 - k] = array[row][array.length - 2 - k];
                   }
                    for (int k = 0; k < row; k++) {
                        array[k][column] = array[k + 1][column];
                    }
                    for (int k = 0; k <  array.length - row - 1; k++) {
                        array[array.length - 1 - k][column] = array[array.length - 2 - k][column];
                    }
        array[row][column] = 0;
    }
}
