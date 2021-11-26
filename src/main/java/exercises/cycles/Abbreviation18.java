package exercises.cycles;

/**
 * Аббревиатуры стали неотъемлемой частью нашей жизни.
 * Мы очень часто используем и много какие выражения сокращаем,
 * забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
 *
 * Метод принимает строку,
 * которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
 * Необходимо из полученной строки сформировать аббревиатуру.
 *
 * Для формирования новой строки используйте StringBuilder и его метод append().
 */

public class Abbreviation18 {

    public static String collect(String s) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < words.length; i++) {
            s = str.append(words[i].charAt(0)).toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(collect("Я Много Очень Ленился Однако Достиг Естественно Цели"));
    }
}
