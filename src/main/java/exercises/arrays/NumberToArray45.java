package exercises.arrays;

/** 4.5. Массив цифр
 *Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * Например
 * 12345 => {5, 4, 3, 2, 1}
 */
public class NumberToArray45 {
    public static void resolve(int number) {
        String str = Integer.toString(number);
        int[] result = new int[str.length()];
        int i = 0;
        while (number > 0) {
            result[i] = number % 10;
            number /= 10;
            System.out.println(result[i]);
            i++;
        }
    }

    public static void main(String[] args) {
     int a = 123456789;
     resolve(a);
            
    }
}
