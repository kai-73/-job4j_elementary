package ru.job4j.converter;

public class Converter {

    public static float rubletoeuro(float value1) {
        return value1 / 70;
    }

    public static float rubletodollar(float value1) {
        return value1 / 60;
    }

    public static float dollartoeuro(float value1) {
        return value1 * 0.86F;
    }

    public static void main(String[] args) {
        float value1 = 140;
        float euro = Converter.rubletoeuro(value1);
        float dollar = Converter.rubletodollar(140);
        float dollartoeuro = Converter.dollartoeuro(euro);
        System.out.println("Exchange " + value1 + " Rub as " + euro + " Euro");
        System.out.println("Exchange " + value1 + " Rub as " + dollar + " Dollar");
        System.out.println("Exchange " + dollar + " Dollar as " + dollartoeuro + " Euro");
    }
}
