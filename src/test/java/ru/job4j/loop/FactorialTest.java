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
    public void whenCalculateFactorialFor0Then1() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(rsl, expected);
    }
}