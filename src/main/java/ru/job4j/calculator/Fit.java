package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 178;
        double man = Fit.manWeight(height);
        System.out.println("Man 178 is " + man);
    }
}
