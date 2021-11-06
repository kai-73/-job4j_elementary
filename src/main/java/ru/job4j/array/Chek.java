package ru.job4j.array;

public class Chek {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
<<<<<<< HEAD
            if (data[0] != data[index]) {
=======
            boolean etallon = data[0];
            if (data[index] != etallon) {
>>>>>>> origin/main
                result = false;
                break;
            }
        }
        return result;
    }
}
