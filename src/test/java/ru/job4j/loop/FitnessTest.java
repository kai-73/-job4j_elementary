package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;
import static  ru.job4j.loop.Fitness.*;

public class FitnessTest {

    @Test
    public void whenIvan95GreatNik90() {
        int ivan = 95;
        int nik = 90;
        int rsl = calc(ivan, nik);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvan90LessNik95() {
        int ivan = 90;
        int nik = 95;
        int rsl = calc(ivan, nik);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvan50LessNik90() {
        int ivan = 50;
        int nik = 90;
        int rsl = calc(ivan, nik);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvan90EqualsNik90() {
        int ivan = 90;
        int nik = 90;
        int rsl = calc(ivan, nik);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
}