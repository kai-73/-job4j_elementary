package exercises.arrays;

public class Transposition18 {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length; //переменной присв размер вн массива - кол-во строк;
        int m = matrix[0].length; // переменной присв размер внутр массива - кол-во элементов в строке(кол-во столбцов))
        int[][] result = new int[m][n]; // инициилизируем 2 мерн массив с перевернутыми элементами(индексами)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
