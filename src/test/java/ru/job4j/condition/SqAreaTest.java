package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Square1() {
        int p = 4;
        double k = 1;
        double expected = 1.0;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K2Square1point38() {
        int p = 5;
        double k = 2;
        double expected = 1.38;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP6K1Square2point25() {
        int p = 6;
        double k = 1;
        double expected = 2.25;
        Assert.assertEquals(expected, (double) SqArea.sqarea(6, 1), 0.01);
    }
}