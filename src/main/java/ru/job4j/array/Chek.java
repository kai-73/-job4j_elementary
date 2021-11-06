package ru.job4j.array;

public class Chek {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            boolean etallon = data[0];
            if (data[index] != etallon) {
                result = false;
                break;
            }
        }
        return result;
    }
}
