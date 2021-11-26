package exercises.arrays;

/**
 * 3.7. Изменить элементы двумерного массива.
 * Метод принимает двумерный массив произвольного размера, в котором может быть сколько угодно рядов, а также произвольное число элементов в ряду. Необходимо перебрать массив и сравнить каждый элемент со значением el которое мы передаем в параметрах метода. При этом:
 *
 * 1. Если элемент массива больше значения el - элемент массива нужно заменить на разность между текущим значением элемента массива и значения el.
 *
 * 2. Если элемент массива меньше или равен el - необходимо заменить текущий элемент массива 0.
 */
public class EditorElementsArray37 {

    public static int[][] changeData(int[][] array, int el) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (array[i][j] <= el) ? 0 : (array[i][j] - el);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] rsl = {{1, 8, 3}, {2, 4, 11}, {-10, 6, 5}};
        changeData(rsl, 3);
        for (int z = 0; z < rsl.length; z++) {
            for (int k = 0; k < rsl[z].length; k++) {
                System.out.print(rsl[z][k] + " ");
            }
            System.out.println();
        }
    }
}
