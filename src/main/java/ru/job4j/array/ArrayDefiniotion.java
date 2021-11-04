package ru.job4j.array;

public class ArrayDefiniotion {

    public static void main(String[] args) {
        int[] ages = new int[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Iya";
        names[1] = "Oleg";
        names[2] = "Karina";
        names[3] = "Almaz";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
