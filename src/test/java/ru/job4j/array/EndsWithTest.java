package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalseOne() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalseTwo() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'n', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}