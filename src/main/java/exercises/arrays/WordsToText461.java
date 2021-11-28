package exercises.arrays;

public class WordsToText461 {
    public static String convert(String[] words) {
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            result = result + " " + words[i];
        }
        return result;
    }
}
