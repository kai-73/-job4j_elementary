package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short heightm) {
        return (heightm - 100) * 1.15;
    }

    public static double womanWeight(short heightw) {
        return (heightw - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightm = 187;
        short heightw = 172;
        double man = Fit.manWeight(heightm);
        double woman = Fit.womanWeight(heightw);
        System.out.println("Man " + heightm + " cm is " + man + " kg");
        System.out.println("Man " + heightw + " cm is " + woman + " kg");
    }
}
