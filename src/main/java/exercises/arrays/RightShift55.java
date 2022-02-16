package exercises.arrays;
import java.util.Arrays;

/**
 * 5.5. Циклический сдвиг вправо
 * Ваша задача выполнить циклический сдвиг вправо с шагом count
 * Например,
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */
public class RightShift55 {
    public static int[] shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
        return nums;
    }

    private static void shift(int[] nums) {
        int tmp = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            /*
            i < nums.length - 1 - так как одну ячейку(первую) мы не трогаем,
            она для занесения туда значения из tmp, т.е. самого последнего элеменнта., который перескакивает
            с конца массива в начало.
             */
            nums[nums.length - 1 - i] = nums[nums.length - 2 - i];
        }
        nums[0] = tmp;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(shift(num, 1)));
    }
}
