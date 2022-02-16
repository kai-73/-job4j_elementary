package exercises.arrays;

/**4.6. Объединение слов
 * Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 * Например,
 * {"one", "two", "three"} => "one two three"
 */

public class WordsToTex46 {
    public static String convert(String[] words) {
        StringBuilder str = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            str.append(" " + words[i]);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert(new String[]{"Hello", "World", "Oleg"}));
    }
}
/* Через тернарник можно
StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append((i + 1) == words.length ? words[i] : words[i] + " ");
        }
        return result.toString();

        Другой вариант
        String result = "";
        StringBuilder str = new StringBuilder();
        for (String word : words) {
            str.append(word + " ");
        }
        return str.toString().trim();
 */