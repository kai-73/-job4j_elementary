package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import  static ru.job4j.condition.Triagle.*;

public class TriagleTest {

    @Test
    public void whenTriagleExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean rsl = exist(ab, ac, bc);
        Assert.assertTrue(rsl);
    }

    @Test
    public void notExist() {
        boolean rsl = exist(2, 3, 4);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenTriagleNotExist() {
        Assert.assertFalse(exist(7, 29, 12));
    }
}