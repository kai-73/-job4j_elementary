package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, String age) {
        System.out.println(name + ", " + age);
    }

    public static void main(String[] args) {
        String name = "Hello";
        String age = "Job4j";
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }

}
