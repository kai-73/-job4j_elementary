package ru.job4j.converter;

public class ConverterTest {

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
            float euro = ConverterTest.rubletoeuro(value1);
            float dollar = ConverterTest.rubletodollar(140);
            float dollartoeuro = ConverterTest.dollartoeuro(euro);
            System.out.println("Exchange " + value1 + " Rub as " + euro + " Euro");
            System.out.println("Exchange " + value1 + " Rub as " + dollar + " Dollar");
            System.out.println("Exchange " + dollar + " Dollar as " + dollartoeuro + " Euro");

            float in = 140;
            float expected = 2;
            float out = ConverterTest.rubletoeuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2 euro. Test result: " + passed);

            float in1 = 240;
            float expected1 = 4;
            float out1 = ConverterTest.rubletodollar(in1);
            boolean passed1 = expected1 == out1;
            System.out.println("240 rubles are 4 dollars. Test result: " + passed1);

            float in2 = 1;
            float expected2 = 0.86f;
            float out2 = ConverterTest.dollartoeuro(in2);
            boolean passed2 = expected2 == out2;
            System.out.println("1 dollars are 0.86 euro. Test result: " + passed2);
        }
}
