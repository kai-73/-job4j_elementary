package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value1) {
        return value1 / 70;
    }

    public static float rubleToDollar(float value1) {
        return value1 / 60;
    }

    public static float dollarToEuro(float value1) {
        return value1 * 0.86F;
    }

    public static void main(String[] args) {
        float value1 = 140;
        float euro = Converter.rubleToEuro(value1);
        float dollar = Converter.rubleToDollar(140);
        float dollartoeuro = Converter.dollarToEuro(euro);
        System.out.println("Exchange " + value1 + " Rub as " + euro + " Euro");
        System.out.println("Exchange " + value1 + " Rub as " + dollar + " Dollar");
        System.out.println("Exchange " + dollar + " Dollar as " + dollartoeuro + " Euro");
    }
}
