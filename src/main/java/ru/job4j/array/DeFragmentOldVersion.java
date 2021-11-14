package ru.job4j.array;

public class DeFragmentOldVersion {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array.length - index - 1; i++) {
                if (array[i] == null) {
                    String temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}