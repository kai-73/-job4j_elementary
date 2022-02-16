package exercises.cycles;
/**
 * 0.5. Вывести стоимость конфет за килограмм.
 * Дано целое число price — цена 1 кг конфет.
 * Вывести стоимость 1, 2, . . . , 5 кг конфет.
 */

public class SweetPrice05 {
    public static int out(int price) {
        int rsl = 0;
         for (int i = 1; i <= 5; i++) {
             rsl = i * price;
            System.out.println("Цена " + i + " кг конфет составляет " + rsl + "руб.");
        }
         return rsl;
    }

    public static void main(String[] args) {
        int rsl = SweetPrice05.out(35);
    }
}

