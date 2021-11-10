package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum1.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum1.sum(array);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0},
                {0, 1}
        };
        int result = MatrixSum1.sum(array);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }
}