package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMonney, boolean beFriend) {
        if (hasMonney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Club.permission(true, true);
        Club.permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
