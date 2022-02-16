package exercises.arrays;

/** 4.5. Массив цифр
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * Например
 * 12345 => {5, 4, 3, 2, 1}
 */

public class NumberToArray451 {
    public static int[] resolve(int number) {
        String str = Integer.toString(number);
        int convert;
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            //char ch = str.charAt(i);
            convert = Character.getNumericValue(str.charAt(i));
            result[str.length() - 1 - i] = convert;
            //convert = Character.getNumericValue(ch);
        }
        return result;
    }
}
