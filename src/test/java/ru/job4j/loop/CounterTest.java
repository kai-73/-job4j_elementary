package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static ru.job4j.loop.Counter.*;

public class CounterTest {

    @Test
    public void whenSumEven1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEven2To15Then56() {
        int start = 2;
        int finish = 15;
        int result = sumByEven(start, finish);
        int expected = 56;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEven6To21Then104() {
        int start = 6;
        int finish = 21;
        int result = sumByEven(start, finish);
        int expected = 104;
        Assert.assertEquals(expected, result);
    }
}

