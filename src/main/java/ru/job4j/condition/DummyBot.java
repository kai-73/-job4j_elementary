package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
            System.out.println(question);
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
            System.out.println(question);
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        System.out.println(DummyBot.answer("Пока."));
    }
}
