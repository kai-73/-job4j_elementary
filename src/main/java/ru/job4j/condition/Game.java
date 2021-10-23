package ru.job4j.condition;

public class Game {

    public static void menu(String name) {
        if (name.equals("Super mario")) {
            System.out.println("Start - super MArio");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
