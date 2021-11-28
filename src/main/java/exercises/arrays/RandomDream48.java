package exercises.arrays;

/**
 * 4.8. Поле чудес
 * Дан массив призов и положительное число, которое сгенерировано случайно. Генерируемое число представляет собой номер, (НЕ индекс) по которому нужно получить приз.
 * Например:
 * {"автомобиль", "квартира", "билет"} и число = 1 => "автомобиль"
 * {"автомобиль", "квартира", "билет"} и число = 2 => "квартира"
 * Номер может выходить за рамки длины массива. В этом случае номер нужно нормировать, т.е. урезать до размеров массива.
 * Например:
 * {"автомобиль", "квартира", "билет"} и число = 4 => "автомобиль"
 * {"автомобиль", "квартира", "билет"} и число = 99 => "билет".
 */
public class RandomDream48 {
    public static String random(String[] prizes, int num) {
        String rsl = null;
        num  = num % prizes.length;
        for (int i = 0; i < prizes.length; i++) {
            if (num == i + 1) {
                rsl = prizes[i];
            } else if (num == 0) {
                rsl = prizes[prizes.length - 1];
            }
        }
        return rsl;
    }
}
/*
 public static String random(String[] prizes, int num) {
        num = num % prizes.length;
        if (num == 0) {
            num = prizes.length;
        }
       return prizes[num - 1];
    }
    другой вариант

  public static String random(String[] prizes, int num) {
     int remainder = num % prizes.length;
     int index = remainder > 0 ? remainder - 1 : prizes.length - 1;
     return prizes[index];




 */
