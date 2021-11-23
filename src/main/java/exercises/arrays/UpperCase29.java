package exercises.arrays;

public class UpperCase29 {

    public static char[] toUpperCase(char[] string) {
        char[] rsl = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                rsl[i] = Character.toUpperCase(string[i]);
            } else {
                rsl[i] = string[i];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        char[] string = {'A', 'b', 'd', '1', '2', '3', '-', 'O', 'l', 'e', 'g'};
        System.out.println(toUpperCase(string));
    }
}
/**
 * Использовать некоторые доп. методы и ознакомиться в остальными:
 *  * <p>
 *  * Character.isLowerCase() — возвращает значение true, если переданный символ в нижнем регистре.
 *  * Character.isUpperCase()) — возвращает значение true, если переданный символ в верхнем регистре.
 *  * Character.toLowerCase() — возвращает указанное значение в нижнем регистре.
 *  * Character.toUpperCase() — возвращает указанное значение в верхнем регистре.
 *  * Character.isLetter() — возвращает значение true, если переданный символ буква.
 *  * Character.isDigit() — возвращает значение true, если переданный символ цифра.
 *  * Character.isWhitespace() — возвращает значение true, если переданный символ пустое пространство ("пробел").
 */
