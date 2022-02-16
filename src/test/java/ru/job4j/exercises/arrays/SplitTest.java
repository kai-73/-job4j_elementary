package ru.job4j.exercises.arrays;

import exercises.arrays.Split57;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SplitTest {

    @Test
    public void test() {
        assertArrayEquals(new String[] {"one", "two"}, convert(Split57.split("one two".toCharArray(), ' ')));
        assertArrayEquals(new String[] {"one", "two", "three"}, convert(Split57.split("one two three".toCharArray(), ' ')));
        assertArrayEquals(new String[] {"onetwothree"}, convert(Split57.split("onetwothree".toCharArray(), ' ')));
    }

    private String[] convert(char[][] splitted) {
        String[] result = new String[splitted.length];
        int ri = 0;
        for (char[] row : splitted) {
            result[ri++] = new String(row);
        }
        return result;
    }
}