package exercises.arrays;

public class MergeRows27 {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[index] = data[i][j];
                index++;
            }
        }
        return array;
    }
}
/**
 * В этой задаче нужно из квадратной матрицы получить массив из одной строки - объединить кв матрицу в один массив.
 * Вводим переменную индекс и применив обход 2 мерной матрицы двумя циклами просто присваиваем каждому элементу
 * нового массива значение счетчика  - index. В самом верху - - размер новогомассива array равен произведению размера длины матрицы
 * т.к. матрица квадратная, то размер умножаем сам на себя.
 *
 */
