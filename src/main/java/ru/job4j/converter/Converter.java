package ru.job4j.converter;

import jdk.jshell.EvalException;

public class Converter {

    public static float rubletoeuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubletodollar(float value) {
        float rsl = value / 60;
        return Math.round(rsl);
    }

    public static float dollartoeuro(float value) {
        float rsl = value * 0.86f;
        return Math.round(rsl);
    }

    public static void main(String[] args) {
        float value = 140;
        float euro = Converter.rubletoeuro(value);
        float dollar = Converter.rubletodollar(140);
        float dollartoeuro = Converter.dollartoeuro(euro);
        System.out.println("Euro: " + value + " " + euro);
        System.out.println("Dollar:" + dollar);
        System.out.println("DollarToEuro:" + dollartoeuro);
    }
}
