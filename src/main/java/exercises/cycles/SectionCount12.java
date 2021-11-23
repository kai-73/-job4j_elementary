package exercises.cycles;

/**
 * 1.2. Найти количество отрезков, используя цикл
 * Даны два целых положительных числа length, section. length это расстояние.
 * Вам нужно не используя операцию деления найти сколько раз отрезок длиной
 * section помещает в length. Нужно использовать цикл while
 *
 * Например,
 *
 * Для length = 2, section = 1 => 2
 *
 * Для length = 3, section = 2 => 1
 */
public class SectionCount12 {
    public static int count(int length, int section) {
        int rsl = section;
        int count = 0;
        while (rsl <= length) {
            rsl += section;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 3, b = 2;
        System.out.println(count(a, b));
    }
}
//public static int count(int length, int section) {
//        return length/section;