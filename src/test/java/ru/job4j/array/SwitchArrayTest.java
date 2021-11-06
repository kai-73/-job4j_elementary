package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int sourse = 0;
        int dest = input.length - 1;
        int[] reesult = SwitchArray.swap(input, sourse, dest);
        int[] exptcted = {4, 2, 3, 1};
    }

    @Test
    public void whenSwap1To5() {
        int[] input = {1, 2, 3, 4, 5};
        int sourse = 1;
        int dest = input[3];
        int[] reesult = SwitchArray.swap(input, sourse, dest);
        int[] exptcted = {1, 4, 3, 2, 5};
    }
}