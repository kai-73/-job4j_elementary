package exercises.cycles;

/**
 * 1.4. Сумма цифр
 * Дано число, нужно получить сумму его цифр
 *
 * Например,
 *
 * 12 => 1 + 2 => 3
 */

public class DigitSum14 {
    public static int sum(int num) {
        int summa = 0;
        while (num != 0) {
            //int digit = num % 10;
            /*
            вычленяет остаток от деления на 10, т.е. извлекаем последнюю цифру числа;
             */
            summa += num % 10;
            /*
            "/ 10" - избавляется от паоследнего разряда, путем деления нацело. Так как int,
            то дробная часть отбрасывается
             */
            num /= 10;
        }
        return summa;
    }

    public static void main(String[] args) {
        System.out.println(sum(10501));
    }
}
