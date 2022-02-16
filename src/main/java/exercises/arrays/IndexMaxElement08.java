package exercises.arrays;

public class IndexMaxElement08 {
    public static int getIndexMax(int[] array) {
        return array[0] > array[array.length - 1] ? 0 : array.length - 1;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 2, 3, 17, 11, 2, 22, 35};
        System.out.println(getIndexMax(array));
    }
}
/**
 * 1.1.6 Массивы. Упражнение 0.8. Индекс максимального значения
 * Надеюсь, что Вы усвоили как необходимо обращаться к элементам массива в общем, и к первому и последнему элементу
 * в частности.
 *
 * В этом задании Вам необходимо расскомментировать код, добавить обращение
 * к элементам массива по индексу и исправить небольшую ошибку.
 * Метод должен вернуть индекс элемента который является максимальным из двух:
 * первый элемент и последний элемент.
 * int first = array[0];
 *         int end = array[array.length - 1];
 *         return Math.max(first, end);
 */