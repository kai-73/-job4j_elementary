package exercises.cycles;

/**
 * 1.3. mod через while
 * Есть операция остаток от деления %.
 * Вам даны два целых положительных числа числа n и d (d > 0). n это делимое, d это делитель.
 * Вам нужно не используя операцию %, найти остаток от деления.
 * Очень красивое решение - int rsl = n - (n/d)*d;
 * return rsl - здесь использ. то свойство, что при делении чисел , если тип переменной
 * целочисленный, то отбрасывается дробная часть...
 */

public class ModWithLoop13 {
    public static int mod(int n, int d) {
        int sum = 0;
        int rsl;
        while (n - sum >= d) {
            sum += d;
        }
    return n - sum;
    }

    public static void main(String[] args) {
        System.out.println(mod(8, 2));
    }
}
