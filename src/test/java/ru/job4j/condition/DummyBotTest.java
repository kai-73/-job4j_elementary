package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import static ru.job4j.condition.DummyBot.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String out = answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenByBot() {
        String in = "Пока.";
        String out = answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenUnknowQuestion() {
        String in = "Как дела придурок?";
        String out = answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, out);
    }
}