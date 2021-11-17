package exercises;

public class Sum06 {
    public static int getSum(int[] array) {
        return array[0] + array[array.length - 1];
    }
}
/*
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void getSum() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 6;
        int result = Sum.getSum(in);
        assertThat(result, is(expected));
    }
}
 */
