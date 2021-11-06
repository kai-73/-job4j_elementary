package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChekTest {

    @Test
    public void whenDataMonoByTrueThentrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean rsl = Chek.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean rsl = Chek.mono(data);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean rsl = Chek.mono(data);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean rsl = Chek.mono(data);
        Assert.assertFalse(rsl);
    }
}