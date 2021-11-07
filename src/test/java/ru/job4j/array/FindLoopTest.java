package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas4Then1() {
        int[] data = {2, 4, 8, 9, 11};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas412Then4() {
        int[] data = {1, 3, 8, 9, 12, 21, 33};
        int el = 11;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}