package ru.job4j.converter;

import jdk.jshell.EvalException;

public class Converter {

    public static float rubletoeuro(float value) {
        float rsl = value / 70;
        return (float) Math.round(rsl * 100) / 100;
    }

    public static float rubletodollar(float value) {
        float rsl = value / 60;
        return (float) Math.round(rsl * 100) / 100;
    }

    public static float dollartoeuro(float value) {
        float rsl = value * 0.86F;
        return (float) Math.round(rsl * 100) / 100;
    }

    public static void main(String[] args) {
        float value = 140;
        float euro = Converter.rubletoeuro(value);
        float dollar = Converter.rubletodollar(140);
        float dollartoeuro = Converter.dollartoeuro(euro);
        System.out.println("Exchange " + value + " Rub as " + euro + " Euro");
        System.out.println("Exchange " + value + " Rub as " + dollar + " Dollar");
        System.out.println("Exchange " + dollar + " Dollar as " + dollartoeuro + " Euro");
    }
}
