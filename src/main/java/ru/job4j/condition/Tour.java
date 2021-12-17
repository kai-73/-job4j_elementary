package ru.job4j.condition;

public class Tour {

    public static void offer(boolean passport) {
        System.out.print("A client has foreign passport : ");
        if (passport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }

    public static void main(String[] args) {
        offer(true);
        offer(false);
    }
}