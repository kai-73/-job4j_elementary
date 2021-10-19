package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter1.rubletoeuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert240RblThen4Dlr() {
        float in1 = 240;
        float expected1 = 4;
        float out1 = Converter1.rubletodollar(in1);
        float eps1 = 0.0001f;
        Assert.assertEquals(expected1, out1, eps1);
    }

    @Test
    public void whenConvert1DlrThenEuro() {
        float in2 = 1;
        float expected2 = 0.86f;
        float eps2 = 0.001f;
        float out2 = Converter1.dollartoeuro(in2);
        Assert.assertEquals(expected2, out2, eps2);
    }
}