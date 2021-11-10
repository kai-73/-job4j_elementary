package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

        @Test
        public void whenSortFiveElements() {
            int[] data = new int[] {3, 4, 1, 2, 5};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[] {1, 2, 3, 4, 5};
            Assert.assertArrayEquals(expected, result);
        }

        @Test
        public void whenSortThreeElements() {
            int[] data = {8, 5, 4};
            int[] expected = {4, 5, 8};
            Assert.assertArrayEquals(expected, SortSelected.sort(data));
        }
}