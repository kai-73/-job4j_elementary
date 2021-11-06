package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        Assert.assertTrue(EqLast.check(left, right));
    }

    @Test
    public void whenNoEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        Assert.assertFalse(EqLast.check(left, right));
    }
}