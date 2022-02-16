package ru.job4j.exercises.arrays;

import exercises.arrays.Anomaly59;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Anomaly59Test {

    @Test
    public void whenTwoAnomalyInPointInDiapason() {
        int[][] expect = {new int[] {1, 3}, new int[] {6, 9}};
        int[] data = {5, 16, 17, 15, 9, 10, 1, 2, 3, 4};
        int up = 15;
        int down = 4;
        int[][] out = Anomaly59.found(data, up, down);
        assertArrayEquals(expect, out);
    }
}