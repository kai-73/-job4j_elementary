package ru.job4j.calculator;

public class ArgMethod1 {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        ArgMethod1.hello(name);
        ArgMethod1.hello(name);
        ArgMethod1.hello(name);
        ArgMethod1.hello(name);
    }
}
