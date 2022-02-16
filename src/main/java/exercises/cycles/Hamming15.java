package exercises.cycles;

/**
 * @Задание 1.5. Расстояние Хэмминга
 * @Описание Расстояние Хэмминга - это число позиций в которых соответствующие символы двух слов одинаковой длины различны.
 * Например, сравнивая "101010111" и "111010100" мы должны получить - 3, поскольку не равны символы
 * (отмечены жирным курсивом и подчеркиванием) - "101010111" и "111010100"
 * Метод принимает 2 строки, всегда одинаковой длины. Необходимо определить для строки расстояние Хэмминга.
 * Для этого в цикле последовательно необходимо сравнивать символы в строке.
 * Для извлечения символа из строки используйте метод charAt(int index) класса String.
 * @author Oleg Romanov
 * @since 24.11.2021
 * @version 1
 */

public class Hamming15 {

    public static int checkStrings(String left, String right) {
        int count = 0, i = 0;
        while (i < left.length()) {
            if (left.charAt(i) != right.charAt(i)) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        String a = "2173896";
        String b = "1238796";
        System.out.println(checkStrings(a, b));
    }
}
