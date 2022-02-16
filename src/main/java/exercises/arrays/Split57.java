package exercises.arrays;
import java.util.Arrays;

public class Split57 {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        int k = 0;
        char[] tempChars = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                tempChars = Arrays.copyOf(tempChars, k);
                result[commonCount - 1] = tempChars;
                tempChars = new char[str.length];
                k = 0;
                commonCount++;
            } else {
                tempChars[k++] = str[i];
                if (i == str.length - 1) {
                    tempChars = Arrays.copyOf(tempChars, k);
                    result[commonCount - 1] = tempChars;
                }
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
