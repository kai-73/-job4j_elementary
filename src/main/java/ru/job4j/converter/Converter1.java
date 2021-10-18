package ru.job4j.converter;

public class Converter1 {

        public static float rubletoeuro(float value1) {
            return value1 / 70;
        }

        public static float rubletodollar(float value1) {
            return value1 / 60;
        }

        public static float dollartoeuro(float value1) {
            return value1 * 0.86f;
        }

        public static void main(String[] args) {
            float value1 = 140;
            float euro = Converter1.rubletoeuro(value1);
            float dollar = Converter1.rubletodollar(140);
            float dollartoeuro = Converter1.dollartoeuro(euro);
            System.out.println("Exchange " + value1 + " Rub as " + euro + " Euro");
            System.out.println("Exchange " + value1 + " Rub as " + dollar + " Dollar");
            System.out.println("Exchange " + dollar + " Dollar as " + dollartoeuro + " Euro");

            float in = 140;
            float expected = 2;
            float out = Converter1.rubletoeuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 euro. Test result: " + passed);

            float in1 = 240;
            float expected1 = 4;
            float out1 = Converter1.rubletodollar(in1);
            boolean passed1 = expected1 == out1;
            System.out.println("240 rubles are 4 dollars. Test result: " + passed1);

            float in2 = 1;
            float expected2 = 0.86f;
            float out2 = Converter1.dollartoeuro(in2);
            boolean passed2 = expected2 == out2;
            System.out.println("1 dollars are 0.86 euro. Test result: " + passed2);
        }
}
