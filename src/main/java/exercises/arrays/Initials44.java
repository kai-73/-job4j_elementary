package exercises.arrays;

/**
 * 4.4. Инициалы
 * Дан массив из трех элементов. В нем записаны соответственно Фамилия Имя Отчество. Ваша задача получить инициалы.
 *
 * Например,
 *
 * "Иванов", "Роман", "Иваныч" -> "Иванов Р.И."
 */
public class Initials44 {
    public static String convert(String[] fio) {
        //StringBuilder str;
        //str = new StringBuilder(fio[0] + ' ' + fio[1].charAt(0) + '.' + fio[2].charAt(0) + '.');
        //return str.toString(); Оба варианта, и нижний- работают.
        //String str = fio[0] + ' ' + fio[1].charAt(0) + '.' + fio[2].charAt(0) + '.';
        //return str;
        StringBuilder rsl = new StringBuilder(fio[0] + " ");
        for (int i = 1; i < fio.length; i++) {
            rsl.append(fio[i].charAt(0)).append(".").append("-").append(fio[i].charAt(1));
        }
        return rsl.toString();
    }

    public static void main(String[] args) {
        String[] rsl = new String[] {"Иванов", "Иван", "Иваныч"};
        System.out.println(convert(rsl));
    }
}
/* Второй интересный вариант
StringBuilder rsl = new StringBuilder(fio[0] + " ");
        for (int i = 1; i < fio.length; i++) {
            rsl.append(fio[i].charAt(0)).append(".");
        }
        return rsl.toString();


 */
