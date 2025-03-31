package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int index = 2; index <= number; index++) {
            if (number > 1) {
                result *= index;
            } else if (number == 0) {
                result = 1;
            } else if (number == 1) {
                result = 0;
            }
        }
        return result;
    }
}
