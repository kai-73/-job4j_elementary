package exercises.arrays;
/**4.9. Разрушение бинарного кода
*Представьте, что вы связист на войне.
 * Вы отловили сигнал противника, ваша задача испортить его.
 * Вы решили это сделать следующим образом, заменить первые 5 символов 0,
 * а последние 5 символов 1.
*Длина исходной последовательности >= 10
*/
public class DestroySequence49 {
    public static char[] destroy(char[] seq) {
    int i = 0;
    while (i < seq.length) {
        while (i < 5) {
            seq[i++] = '0';
        }
        while (i >= (seq.length - 5) && (i != seq.length)) {
            seq[i++] = '1';
        }
        i++;
    }
    return seq;
    }

    public static void main(String[] args) {
        char[] a = new char[]{'9', '8', '3', '2', '1', '1', '4', '4', '2', '1', '1', '6', '6', '4', '3', '2', '4'};
            System.out.println(destroy(a));
    }
}
/*
public static char[] destroy(char[] seq) {
        for (int i = 0; i < 5; i++) {
                seq[i] = '0';
                seq[(seq.length - 1) - i] = '1';
        }
        return seq;
    }
 */
