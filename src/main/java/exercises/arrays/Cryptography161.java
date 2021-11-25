package exercises.arrays;

/**
 * Данная программа - используется для практики с методами String
 * здесь, строка произвольного размера разбиввается на две подстроки с условием, что в первую
 * подстрорку входят только последние 4 символа, а во вторую - все остаьные.
 * Затем все символы из второй подстроки заменяются на символ"#" и потом две подстроки опять объеденяются
 * в одну строку.
 */
public class Cryptography161 {
    public static void code(String s) {
        String s1 = s.substring(s.length() - 4);
        //String s2 = s.substring(0, s.length() - 4);
        String convert  = s.substring(0, s.length() - 4).replaceAll("\\w *", "#");
        String result = convert + s1;
        //boolean rsl = s.matches("0\\w*");
        //if (rsl) {
        // res = s.replaceAll("0", "");
        //}

        System.out.println(s1);

        System.out.println(convert);
        System.out.println(result);

    }

    public static void main(String[] args) {
        code("100000012345");
    }
}
