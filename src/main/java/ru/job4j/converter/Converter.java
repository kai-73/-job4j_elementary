package ru.job4j.converter;

public class Converter {

    public static float rubletoeuro(float value) {
        return value / 70;
    }

    public static float rubletodollar(float value) {
        return value / 60;
    }

    public static float dollartoeuro(float value) {
        return value * 0.86F;
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
