package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double difAndDivision(double first, double second) {
        return MathFunction.dif(first, second)
                + MathFunction.division(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + dif(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + difAndDivision(10, 20));
        System.out.println("Результат расчёта равен: " + sumAllOperation(10, 20));
    }
}
