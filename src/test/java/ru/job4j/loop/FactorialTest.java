package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThen120() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenCalculateFactorialFor7Then5040() {
        int rsl = Factorial.calc(7);
        int expected = 5040;
        Assert.assertEquals(rsl, expected);
    }
}