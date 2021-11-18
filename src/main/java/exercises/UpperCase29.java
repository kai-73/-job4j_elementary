package exercises;

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
