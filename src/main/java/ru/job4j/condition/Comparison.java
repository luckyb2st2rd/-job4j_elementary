package ru.job4j.condition;

public class Comparison {
    public static int srav(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int num = srav(5, 3, 2);
        System.out.println(num);
        int num1 = srav(1, 3, 2);
        System.out.println(num1);
        int num2 = srav(1, 2, 3);
        System.out.println(num2);
    }
}
