package exercises;

public class IndexOfWithCount23 {
    public static int indexOf(char[] string, char c, int number) {
        int rls = -1;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                number--; // считает кол-во вхождений на уменьшение.
            }
            if (number == 0) { //если кол-во вхождений исчерпано, то возвращает значение i
                return i;
            }
        }
        return rls;
    }

    public static void main(String[] args) {
        char[] string = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'd'};
        System.out.println(indexOf(string, 'd', 2));
    }

}
/*
В этой задача метод должен вернуть индекс искомого символа в зависимости
от number(кол-во вхождений), задается в параметрах метода изначально.
Если в массиве два и более искомых символа, то number указывает нам нам на то, что какой индекс нам нужно вернуть.
Например, в массиве три символа 'd', а number = 2, то нужно вернуть индекс второго символа 'd' - его индекс.
 */