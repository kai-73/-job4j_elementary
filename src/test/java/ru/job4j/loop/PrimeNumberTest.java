package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void whenFive() {
        int rsl = PrimeNumber.calc(5);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenEleven() {
        Assert.assertEquals(5, PrimeNumber.calc(11));
    }

    @Test
    public void whenTwo() {
        Assert.assertEquals(1, PrimeNumber.calc(2));
    }
}