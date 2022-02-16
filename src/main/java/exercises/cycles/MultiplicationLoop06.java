/**
 * 0.6. Произведение чисел в диапазоне
 * Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
 */
package exercises.cycles;

public class MultiplicationLoop06 {
    public static int mult(int a, int b) {
    int work = 1;
        for (int i = a; i <= b; i++) {
            work *= i;
        }
        return work;
    }
}
